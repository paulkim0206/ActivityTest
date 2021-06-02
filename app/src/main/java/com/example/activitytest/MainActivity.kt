package com.example.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitytest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val secondIntent = Intent(this,SubActivity::class.java)

        binding.btnGoSubActivity.setOnClickListener {
            val putText: String = binding.editText.text.toString()
            secondIntent.putExtra("show", putText)
            startActivity(secondIntent)
        }
    }
}