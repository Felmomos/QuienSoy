package com.danfelortiz.quiensoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import kotlin.Result

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        val bxname = findViewById<EditText>(R.id.bxName)
        val bxage = findViewById<EditText>(R.id.bxAge)
        val bxaddr = findViewById<EditText>(R.id.bxAddr)
        val bxhobbie = findViewById<EditText>(R.id.bxHobbie)
        val error = findViewById<TextView>(R.id.error)
        val reg = findViewById<AppCompatButton>(R.id.btDone)

        reg.setOnClickListener {
            var name = bxname.text.toString()
            var age = bxage.text.toString()
            var addr = bxaddr.text.toString()
            var hobbie = bxhobbie.text.toString()

            if (name.isNotEmpty() && age.isNotEmpty() && addr.isNotEmpty() && hobbie.isNotEmpty()){
                val res = Intent(this, com.danfelortiz.quiensoy.Result::class.java)
                res.putExtra("EXTRA_NAME", name)
                res.putExtra("EXTRA_AGE", age)
                res.putExtra("EXTRA_ADDR", addr)
                res.putExtra("EXTRA_HOBBIE", hobbie)
                startActivity(res)

            }else{
                error.text = "Todos los campos deben estar llenos"

            }
        }

    }
}