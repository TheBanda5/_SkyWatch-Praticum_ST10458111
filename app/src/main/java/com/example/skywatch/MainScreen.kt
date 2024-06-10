package com.example.skywatch

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainScreen : AppCompatActivity() {

    private var temperatures = arrayOf(20, 22, 25, 23, 24, 21, 19) // Example of temperatures for each day of the week
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_screen)

        val detailsButton = findViewById<Button>(R.id.detailsButton)
        val editText = findViewById<TextView>(R.id.editText)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        // Calculate the average temperature of the week
        val averageTemperature = calculateAverageTemperature()

        // Display the temperature
        val temperature = 25 // Suppose que la température est de 25 degrés Celsius
        editText.setText("Display the temperature: $temperature°C")


        detailsButton.setOnClickListener {
            val intent = Intent(this, DetailledView::class.java)
            startActivity(intent)
        }

        clearButton.setOnClickListener {
            clearData()
        }

        exitButton.setOnClickListener {
            finish()
        }
    }

    private fun calculateAverageTemperature(): Double {
        var sum = 0
        for (temperature in temperatures) {
            sum += temperature
        }
        return sum.toDouble() / temperatures.size
    }

    private fun clearData() {

    }
}