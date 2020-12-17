package com.leonard.neumorphism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leonard.neumorphism.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.fab.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            }

        binding.imageButton.setOnClickListener {
            startActivity(Intent(this, CardSampleActivity::class.java))
        }
    }
}