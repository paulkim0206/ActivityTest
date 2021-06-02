package com.example.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitytest.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    lateinit var binding:ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gotText = intent.getStringExtra("show")
        binding.textView.text = gotText.toString()

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}
