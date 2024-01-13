package com.example.a123

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.navigation.ui.AppBarConfiguration
import com.example.a123.databinding.ActivityLikeeeBinding
//import com.example.a123.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class LikeeeActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityLikeeeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_likeee)

        binding = ActivityLikeeeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.background.setImageResource(R.drawable.photogood)
        val beh = binding.pane.layoutParams as CoordinatorLayout.LayoutParams
        (beh.behavior as BottomSheetBehavior).setPeekHeight(300)

        val name = findViewById<TextView>(R.id.view_user_name)
        val description = findViewById<TextView>(R.id.view_user_description)
        val gender = findViewById<TextView>(R.id.view_user_gender)
        val geoloc = findViewById<TextView>(R.id.view_user_geoloc)
        val lastlogin = findViewById<TextView>(R.id.view_user_lastlogin)

        val button_link_auth : TextView = findViewById(R.id.button_reg)
        button_link_auth.setOnClickListener {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }
    }
}