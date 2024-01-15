package com.example.a123

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.a123.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //ниже лежит то что нужно засунуть в ифелс конструкцию проверки авторизации человеткина
        setContentView(R.layout.activity_auth)
        val intent = Intent(this, AuthActivity::class.java)
        startActivity(intent)

    }
}