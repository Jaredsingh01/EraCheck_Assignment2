package com.example.eracheckhistoryappassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //declaring a button that prompts the user to begin the quiz
        val startQuiz = findViewById<Button>(R.id.startQuiz)

        //the code to prompt the app to move onto the next page(mainActivity)
        startQuiz.setOnClickListener {
            val intent = Intent(this, Quiz::class.java)
            startActivity(intent)

        }
    }
}