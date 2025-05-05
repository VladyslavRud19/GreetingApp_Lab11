package com.example.greetingapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.greetingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goButton.setOnClickListener {
            val name = binding.nameEditText.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this, GreetingActivity::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
            }
        }
    }
}