package com.example.a123

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val button_main_link: TextView = findViewById(R.id.button_link_main)
        val button_reg_link: TextView = findViewById(R.id.button_link_reg)
        button_main_link.setOnClickListener {
            val intent = Intent(this, LikeeeActivity::class.java)
            startActivity(intent)
        }
        button_reg_link.setOnClickListener {
            val intent = Intent(this, RegActivity::class.java)
            startActivity(intent)
        }

    }
}