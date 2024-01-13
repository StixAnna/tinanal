package com.example.a123

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
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
//        val name = findViewById<TextView>(R.id.view_user_name)
//        val description = findViewById<TextView>(R.id.view_user_description)
//        val gender = findViewById<TextView>(R.id.view_user_gender)
//        val geoloc = findViewById<TextView>(R.id.view_user_geoloc)
//        val lastlogin = findViewById<TextView>(R.id.view_user_lastlogin)
//        val button = findViewById<TextView>(R.id.button_reg)

    }


}