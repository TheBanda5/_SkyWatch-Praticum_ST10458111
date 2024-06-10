package com.example.skywatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnNext.setOnClickListener{
            // Move to next page
            val intent = Intent(this, MainScreen::class.java)
        }

        btnExit.setOnClickListener{
            // CLose the app
            finish()
        }
    }
}