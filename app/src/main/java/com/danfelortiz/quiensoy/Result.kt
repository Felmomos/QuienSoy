package com.danfelortiz.quiensoy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val text = findViewById<TextView>(R.id.tvResult)
        val end = findViewById<AppCompatButton>(R.id.btSalir)
        val name:String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        val age:String = intent.extras?.getString("EXTRA_AGE").orEmpty()
        val addr:String = intent.extras?.getString("EXTRA_ADDR").orEmpty()
        val hobbie:String = intent.extras?.getString("EXTRA_HOBBIE").orEmpty()

        text.text = "$name, tienes $age años, vives en $addr y te gusta pasar el tiempo realizando $hobbie :D"

        end.setOnClickListener {
            finishAffinity()
        }
    }
}