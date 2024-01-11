package com.example.a123

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.a123.databinding.ActivityRegisterBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val name = findViewById<TextView>(R.id.user_name)
        val description = findViewById<TextView>(R.id.user_description)
        val gender = findViewById<TextView>(R.id.user_gender)
        val geoloc = findViewById<TextView>(R.id.user_geoloc)
        val lastlogin = findViewById<TextView>(R.id.user_lastlogin)
        val button = findViewById<TextView>(R.id.button)

    }


}