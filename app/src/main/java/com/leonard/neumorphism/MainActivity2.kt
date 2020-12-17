package com.leonard.neumorphism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leonard.neumorphism.databinding.ActivityMain2Binding
import com.leonard.neumorphism.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.flatCard.setOnClickListener {
            startActivity(Intent(this, ListSampleActivity::class.java))
        }

        binding.textview.setOnClickListener {
            binding.textview.text = listOf("Neumorphism", "in", "Android").random()
        }
    }
}