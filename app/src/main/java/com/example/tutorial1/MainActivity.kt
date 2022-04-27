package com.example.tutorial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height = findViewById<TextView>(R.id.height_input)
        val btn = findViewById<Button>(R.id.submit)

        btn.setOnClickListener {
            height.text = "How are you"
        }
    }

}