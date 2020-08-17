package com.hungnd.androidday5.ex3.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hungnd.androidday5.R
import kotlinx.android.synthetic.main.activity_b3.*
import java.util.*

class B3Activity : AppCompatActivity() {
    private var questionCount: Int = 0
    private var correctAnswer: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b3)
        question()
        btn_A.setOnClickListener { checkAnswer(0) }
        btn_B.setOnClickListener { checkAnswer(1) }

    }

    private fun question() {
        val rd = Random()
        val a = rd.nextInt(1000)
        val b = rd.nextInt(1000)

        val question: String = "$a + $b = ?"
        correctAnswer = a + b
        val correctIndex = rd.nextInt(3)
        val wrongAnswer = rd.nextInt(5000)
        if (correctIndex == 0) {
            tv_QuestionA.setText("$correctAnswer")
            tv_QuestionB.setText("$wrongAnswer")
        } else {
            tv_QuestionA.setText("$wrongAnswer")
            tv_QuestionB.setText("$correctAnswer")
        }
        tv_Question.setText(question)
        questionCount++
        tv_Stt.setText("$questionCount")

    }

    open fun checkAnswer(answer: Int) {
        val aHungDzaiAnswer: String =
            if (answer == 0) tv_QuestionA.text.toString()
            else tv_QuestionB.text.toString()
        if (correctAnswer.toString() == aHungDzaiAnswer) {
            question()
        } else {
            Toast.makeText(this, "Game Over", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }

    }


}