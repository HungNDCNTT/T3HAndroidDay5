package com.hungnd.androidday5.ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hungnd.androidday5.R
import kotlinx.android.synthetic.main.activity_main.*

class B1Activity : AppCompatActivity() {
    private var numberOne: Int = 0
    private var numberTwo: Int = 0
    private var kq: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click()
    }

    private fun click() {
        btn_Addition.setOnClickListener { init("+") }
        btn_SubTracTion.setOnClickListener { init("-") }
        btn_Multiplication.setOnClickListener { init("*") }
        btn_Division.setOnClickListener { init("/") }


    }

    private fun init(caculation: String) {
        if (edt_NumberOne.text.isEmpty()) {
            Toast.makeText(this, "Enter Number One", Toast.LENGTH_SHORT).show()
            return
        }
        if (edt_NumberTwo.text.isEmpty()) {
            Toast.makeText(this, "Enter Number Two", Toast.LENGTH_SHORT).show()
            return
        }
        numberOne = edt_NumberOne.text.toString().toInt()
        numberTwo = edt_NumberTwo.text.toString().toInt()

        kq = when (caculation) {
            "+" -> numberOne + numberTwo
            "-" -> numberOne - numberTwo
            "*" -> numberOne * numberTwo
            "/" -> numberOne / numberTwo
            else -> 0
        }
        tv_ShowResult.text = "Result: ${kq.toString()}"
    }


}