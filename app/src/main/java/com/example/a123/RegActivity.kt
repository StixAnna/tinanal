package com.example.a123

import android.app.ActionBar
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

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val actionBar: androidx.appcompat.app.ActionBar? = supportActionBar
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//        supportActionBar!!.title = ""
        val button_main_link : TextView = findViewById(R.id.button_link_main)
        val button_auth_link : TextView = findViewById(R.id.button_link_auth)
        button_main_link.setOnClickListener {
            val intent = Intent(this, LikeeeActivity::class.java)
            startActivity(intent)
        }
        button_auth_link.setOnClickListener {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }
        val regname : EditText = findViewById(R.id.user_name_register)
        val reglogin : EditText = findViewById(R.id.user_login_register)
        val regpswd : EditText = findViewById(R.id.user_pass_register)
        val button_reg : Button = findViewById(R.id.btn_cnfrm_setngs)

        button_reg.setOnClickListener{
            val name = regname.text.toString().trim();
            val login = reglogin.text.toString().trim();
            val pswd = regpswd.text.toString().trim();

            if(name == "" || login == "" || pswd == "")
                Toast.makeText(this, "Заполните все поля!", Toast.LENGTH_LONG).show()
            else{//ELSE ADD TO DB
                val user = User(login,pswd,name)
                Register(login,pswd,name)

                regname.text.clear()
                reglogin.text.clear()
                regpswd.text.clear()
            }
        }

    }
    private fun Register(login: String, password: String, name: String){
        val url = "http://192.168.88.235:5000/register" +
                "?Login=$login&Password=$password&Name=$name"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            {
                    response->
                val gObject = JSONObject(response)
                val res = gObject.getString("result")
                Toast.makeText(this, "** $login dobavlyaetsya v BD**", Toast.LENGTH_LONG).show()
            },
            {
                Log.d("MyLog","Volley error: $it")
            }
        )
        queue.add(stringRequest)
    }


}