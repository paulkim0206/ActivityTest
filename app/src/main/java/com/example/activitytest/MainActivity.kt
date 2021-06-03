package com.example.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.activitytest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val secondIntent = Intent(this,SubActivity::class.java)

        binding.btnGoSubActivity.setOnClickListener {
            var putText: String = binding.editText.text.toString()

            if (putText=="1234") {
                secondIntent.putExtra("show", putText)
                startActivity(secondIntent)
            } else {
                Toast.makeText(this, "비밀번호가 틀렸습니다!", Toast.LENGTH_SHORT).show()
            }


        }
    }
}