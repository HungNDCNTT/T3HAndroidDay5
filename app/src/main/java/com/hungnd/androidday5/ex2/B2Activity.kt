package com.hungnd.androidday5.ex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hungnd.androidday5.R
import kotlinx.android.synthetic.main.activity_b2.*

class B2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b2)



        btn_Login.setOnClickListener {
            val emailDefault: String = "t3h"
            val passDefault: String = "t3h"
            val email: String = edt_Email.text.toString()
            val password: String = edt_Password.text.toString()
            if (email.equals(emailDefault) && password.equals(passDefault)) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Fail", Toast.LENGTH_SHORT).show()
            }
        }
        edt_SignUp.setOnClickListener {
            val intent: Intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}