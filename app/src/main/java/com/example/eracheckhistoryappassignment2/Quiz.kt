package com.example.eracheckhistoryappassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//the 5 questions that will be used to test the user saved as an array
class Quiz : AppCompatActivity() {
    private val questions = arrayOf(
        "The Great Wall of China was built over many centuries by different dynasties, not in a single project.",
        "The Declaration of Independence was signed in 1776.",
        "The Titanic sank on its maiden voyage in 1912.",
        " The Berlin Wall fell in 1989, marking the end of the Cold War era.",
        "Julius Caesar was a dictator, but the first emperor of Rome was Augustus (his adopted heir).")


    //the answers for the questions that was stored in the array and in this case all is either true or false question and answers resulting in an boolean array while in the same order as the array
    private val answers = booleanArrayOf(false, true, true, true, false)

    //this variable keeps track on what question the user is on (starting from 0)
    private var currentQuestionIndex = 0

    //this variable stores how many correct answers the user gets as they proceed to answer the questions (starting from 0)
    private var score = 0

    //declaring the elements
    private lateinit var questionText: TextView //the question that is will displayed
    private lateinit var feedbackText: TextView //shows weather the answer is "correct" or "incorrect"
    private lateinit var trueButton: Button //button set for answering "True"
    private lateinit var falseButton: Button // button set for answering "False"
    private lateinit var nextButton: Button //button set for moving onto the next question

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        //linking the variable to the corresponding XML file by using their ID's
        questionText = findViewById(R.id.questionText)
        feedbackText = findViewById(R.id.feedbackText)
        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)
        nextButton = findViewById(R.id.nextButton)

        //this displays the first question the user's see when the quiz begins
        showQuestion()

        //this is what the app will do if the user clicks on the "True" button
        trueButton.setOnClickListener {
            checkAnswer(true)
        }

        //this is what the app will do if the user clicks on the "False" button
        falseButton.setOnClickListener {
            checkAnswer(false)
        }

        //this is what the app will do if the user clicks on the "Next Question" button
        nextButton.setOnClickListener {
            currentQuestionIndex++ // this moves to the next question that was stored in the array

            if (currentQuestionIndex < questions.size) {
                showQuestion()
                feedbackText.text = ""

            } else {
                //if all the questions have been answered this will allow the user to move onto their result page
                val intent = Intent(this, Results::class.java) //this switch is to move onto the result page
                intent.putExtra("score", score) //this carries the users results
                intent.putExtra("total", questions.size) //this carries the total number of questions
                startActivity(intent) //this allows the result page to launch
                finish() //this closes the entire app so that the user is not able to come back
            }
        }
    }

    //this shows the current question on the screen
    private fun showQuestion(){
        questionText.text = questions[currentQuestionIndex] //this sets the text that will be displayed
        trueButton.isEnabled = true //this will re-enable the button so that the user can answer the next question
        falseButton.isEnabled = true //this will re-enable the button so that the user can answer the next question
    }

    //this function checks if the user's answer is correct or not
    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = answers[currentQuestionIndex] //get the correct answer for the current question

        //if the user's answer is correct, increase the score counter and displays "Correct!"
        if (userAnswer == correctAnswer) {
            feedbackText.text = "Correct!"
            score++
            //if the user's answer is incorrect, it displays "Incorrect!"
        }else {
            feedbackText.text = "Incorrect!"
        }

        //this disables both the buttons so the user cant click the button again
        trueButton.isEnabled = false
        falseButton.isEnabled = false
    }
}