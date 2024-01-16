package com.example.a123

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val actionBar: androidx.appcompat.app.ActionBar? = supportActionBar
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//        supportActionBar!!.title = "11111111111111111111111"
        val button_main_link : TextView = findViewById(R.id.button_link_main)
        button_main_link.setOnClickListener {
            val intent = Intent(this, LikeeeActivity::class.java)
            startActivity(intent)
        }

        val regname : EditText = findViewById(R.id.user_name_register)
        val regtg : EditText = findViewById(R.id.user_tg_register)
        val regcity : EditText = findViewById(R.id.user_city_register)
        val regimg : EditText = findViewById(R.id.user_img_add)
        val reggender : Spinner = findViewById(R.id.user_gender_register)
        val regdesc : EditText = findViewById(R.id.user_descr)
        val button_reg : Button = findViewById(R.id.btn_cnfrm_setngs)

        button_reg.setOnClickListener{
            val name = regname.text.toString().trim();
            val telegram = regtg.text.toString().trim();
            val city = regcity.text.toString().trim();
            val gender = reggender.textAlignment.toString().trim();
            val imgpath = regimg.text.toString().trim();
            val desc = regdesc.text.toString().trim();

            if(name == "" || telegram == "" || city == "" || gender == ""|| imgpath == "" || desc == "")
                Toast.makeText(this, "Заполните все поля!", Toast.LENGTH_LONG).show()
            else{//ELSE ADD TO DB
                Toast.makeText(this, "**chaning info v BD**", Toast.LENGTH_LONG).show()
            }
        }
    }
}