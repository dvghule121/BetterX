package com.example.tutorial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height  =  findViewById<EditText>(R.id.height)
        val weight = findViewById<EditText>(R.id. weight)
        val result = findViewById<TextView>(R.id.bmi)
        val resultText = findViewById<TextView>(R.id.result)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val bmi = (weight.text.toString().toInt()*10000)/(height.text.toString().toInt()*height.text.toString().toInt())
            result.text = bmi.toString()

            if (bmi < 18){
                resultText.text = "You're underweight"
                findViewById<CardView>(R.id.cardView).setBackgroundResource(R.color.healthy)

            }
            else if (bmi in 18..25){
                resultText.text = "You're Healthy"
                findViewById<CardView>(R.id.cardView).setBackgroundResource(R.color.underweight)

            }
            else if (bmi in 25..30){
                resultText.text = "You're overweight"
                findViewById<CardView>(R.id.cardView).setBackgroundResource(R.color.overweight)

            }
            else if (bmi > 30){
                resultText.text = "You're very overweight"
                findViewById<CardView>(R.id.cardView).setBackgroundResource(R.color.veryweight)
            }
        }
    }

}