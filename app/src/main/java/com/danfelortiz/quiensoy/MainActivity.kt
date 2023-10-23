package com.danfelortiz.quiensoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bt = findViewById<AppCompatButton>(R.id.btReg)

        bt.setOnClickListener{
            var form = Intent(this, Form::class.java)
            startActivity(form)
        }
    }
}