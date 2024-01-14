package com.example.a123

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

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
        val regtg : EditText = findViewById(R.id.user_tg_register)
        val regcity : EditText = findViewById(R.id.user_city_register)
        val reggender : Spinner = findViewById(R.id.user_gender_register)
        val reglogin : EditText = findViewById(R.id.user_login_register)
        val regpswd : EditText = findViewById(R.id.user_pass_register)
        val button_reg : Button = findViewById(R.id.button_subm_reg)

        button_reg.setOnClickListener{
            val name = regname.text.toString().trim();
            val telegram = regtg.text.toString().trim();
            val city = regcity.text.toString().trim();
            val gender = reggender.textAlignment.toString().trim();
            val login = reglogin.text.toString().trim();
            val pswd = regpswd.text.toString().trim();

            if(name == "" || telegram == "" || city == "" || gender == "" || login == "" || pswd == "")
                Toast.makeText(this, "Заполните все поля!", Toast.LENGTH_LONG).show()
            else{//ELSE ADD TO DB
                Toast.makeText(this, "**dobavlyaetsya v BD**", Toast.LENGTH_LONG).show()
            }
        }

    }


}