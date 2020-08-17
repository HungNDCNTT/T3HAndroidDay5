package com.hungnd.androidday5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hungnd.androidday5.ex1.B1Activity
import com.hungnd.androidday5.ex2.B2Activity
import com.hungnd.androidday5.ex3.activities.B3Activity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn_ex1.setOnClickListener {
            var intent: Intent = Intent(this, B1Activity::class.java)
            startActivity(intent)
        }
        btn_ex2.setOnClickListener {
            var intent: Intent = Intent(this, B2Activity::class.java)
            startActivity(intent)
        }
        btn_ex3.setOnClickListener {
            var intent: Intent = Intent(this, B3Activity::class.java)
            startActivity(intent)
        }
    }


}