package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnNext = findViewById<Button>(R.id.btnStarted)
        btnNext.setOnClickListener {
            val intent = Intent ( this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }


    }
}