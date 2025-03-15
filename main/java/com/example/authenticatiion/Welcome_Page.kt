package com.example.authenticatiion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome_Page : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        //Declare the Button

        val btnContinue=findViewById<Button>(R.id.btnContinue)

        //Setting the Action when the button is clicked
        btnContinue?.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}