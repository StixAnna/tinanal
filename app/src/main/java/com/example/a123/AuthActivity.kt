package com.example.a123

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Thread.sleep
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder


class AuthActivity : AppCompatActivity() {
    var login_status = false
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

//        val actionBar: androidx.appcompat.app.ActionBar? = supportActionBar
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//        supportActionBar!!.title = ""
        val button_main_link: TextView = findViewById(R.id.button_link_main)
        val button_reg_link: TextView = findViewById(R.id.button_link_reg)
        val button_auth : Button = findViewById(R.id.button_subm_auth)

        val authlogin : EditText = findViewById(R.id.user_login_auth)
        val authpswd : EditText = findViewById(R.id.user_pass_auth)



        button_main_link.setOnClickListener {
            val intent = Intent(this, LikeeeActivity::class.java)
            startActivity(intent)
        }
        button_reg_link.setOnClickListener {
            val intent = Intent(this, RegActivity::class.java)
            startActivity(intent)
        }
        button_auth.setOnClickListener{
            val login = authlogin.text.toString().trim();
            val pswd = authpswd.text.toString().trim();
            if(login == "" || pswd == "") {
//                val db = dbHelper(this,null)
//                db.onUpgrade(null, 1,2)
                Toast.makeText(this, "Заполните все поля!", Toast.LENGTH_LONG).show()
            }
            else{//запрос к бд на наличие такого челика и редирект на залогиненную версию
                //val db = dbHelper(this,null)
                Login(login,pswd)
                val isauth = login_status

                Log.d("STATUS","LOGIN_STATUS_BUTTREQ $login_status")



            }
        }
    }

    private fun Login(login: String, password: String){
        val url = "http://192.168.88.235:5000/login" +
                "?Login=$login&Password=$password"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            {
                    response->
                val gObject = JSONObject(response)
                val res = gObject.getString("result")
                login_status = res == "true"
                Log.d("STATUS","LOGIN_STATUS_REQ $login_status")
                if(login_status){
                    Toast.makeText(this, "**user $login authorized v BD**", Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this, "**user $login not_authorized v BD**", Toast.LENGTH_LONG).show()
                }
            },
            {
                Log.d("MyLog","Volley error: $it")
            }
        )
        queue.add(stringRequest)
    }

}