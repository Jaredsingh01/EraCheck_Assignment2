package com.example.eracheckhistoryappassignment2

//Title: Era Check History Quiz
//Author: Jared Singh
//Date: 16 May 2025
//Version: 1.0
//Available:https://www.w3schools.com/reference/android/app/Activity
//Additional Reference: https://developer.android.com/kotlin/reference/android/Button
// Additional Reference:https://github.com/marketplace/actions/automated-build-android-app-with-
//github-action

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_results)

        //this is calling the score and total from the intent extras
        val score = intent.getIntExtra("score", 0)
        val total = intent.getIntExtra("total", 5)

        //this is initializing the UI elements
        val scoreText: TextView = findViewById(R.id.scoreText)
        val feedbackMessage: TextView = findViewById(R.id.feedbackMessage)
        val reviewButton: Button = findViewById(R.id.reviewButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        //displays the final score
        scoreText.text = "You scored $score / $total"

        //this displays the custom feedbacks based on the score that the user got
        feedbackMessage.text = when (score) {
            5 -> "You are a genius!"
            4 -> "You are a  genius!"
            3 -> "Not bad!, But your quiz score will remain the same if you don’t study! "
            2 -> "Not bad!, But your quiz score will remain the same if you don’t study! "
            else -> "History doesn’t repeat itself—but your quiz score will if you don’t study!"
        }

        //this shows the correct answers
        reviewButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Correct Answers")
                .setMessage(
                    """
                    1. False, The Great Wall of China was built over many centuries by different dynasties, not in a single project.
                    
                    2. True,  The Declaration of Independence was signed in 1776.
                    
                    3. True, The Titanic sank on its maiden voyage in 1912.
                    
                    4. True, The Berlin Wall fell in 1989, marking the end of the Cold War era.
                    
                    5. False, Julius Caesar was a dictator, but the first emperor of Rome was Augustus (his adopted heir),
                    """.trimIndent()
                )
                .setPositiveButton("OK", null)
                .show()
        }

        //this closes the app when the user clicks "Exit"
        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}

