package com.hungnd.androidday5.ex2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hungnd.androidday5.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        imv_back.setOnClickListener {
            val intent: Intent = Intent(this, B2Activity::class.java)
            startActivity(intent)
        }
        btn_Register.setOnClickListener {
            if (edt_EmailAdress.text.isEmpty()) {
                Toast.makeText(this, "Please enter Email Address", Toast.LENGTH_SHORT).show()
            } else if (edt_Password.text.isEmpty()) {
                Toast.makeText(this, "Please enter Password", Toast.LENGTH_SHORT).show()
            } else if (edt_FirstName.text.isEmpty()) {
                Toast.makeText(this, "Please enter First name", Toast.LENGTH_SHORT).show()
            } else if (edt_LastName.text.isEmpty()) {
                Toast.makeText(this, "Please enter Last name", Toast.LENGTH_SHORT).show()
            } else if (edt_Date.text.isEmpty()) {
                Toast.makeText(this, "Please enter Date", Toast.LENGTH_SHORT).show()
            } else if (edt_Height.text.isEmpty()) {
                Toast.makeText(this, "Please enter Height", Toast.LENGTH_SHORT).show()
            } else if (edt_Weight.text.isEmpty()) {
                Toast.makeText(this, "Please enter Weight", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Register Successful", Toast.LENGTH_SHORT).show()
               finish()
            }
        }
    }


}