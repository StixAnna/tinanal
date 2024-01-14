package com.example.a123

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AuthActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

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
            if(login == "" || pswd == "")
                Toast.makeText(this, "Заполните все поля!", Toast.LENGTH_LONG).show()
            else{//запрос к бд на наличие такого челика и редирект на залогиненную версию
                Toast.makeText(this, "**proverka hashlogina v BD**", Toast.LENGTH_LONG).show()
            }
        }
    }
}