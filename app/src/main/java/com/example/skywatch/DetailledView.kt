package com.example.skywatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailledView : AppCompatActivity() {

    private var temperatures = arrayOf(
        20,
        22,
        25,
        23,
        24,
        21,
        19
    ) // Exemple de températures pour chaque jour de la semaine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailled_view)

        // Display the details for each day
        displayDetails()

        val detailedTextView = findViewById<TextView>(R.id.detailedTextView)
        val backButton = findViewById<Button>(R.id.backButton)

        backButton.setOnClickListener {
            finish()
        }
    }


    private fun displayDetails() {
        // To iterate through the temperature array and display the details for each day
        val detailedTextView = findViewById<TextView>(R.id.detailedTextView)
        for (i in 0 until temperatures.size) {
            detailedTextView.append("Jour ${i + 1}: Température ${temperatures[i]} °C\n")
        }
    }
}