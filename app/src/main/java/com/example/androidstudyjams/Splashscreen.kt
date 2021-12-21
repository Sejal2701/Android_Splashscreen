package com.example.androidstudyjams

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splashscreen : AppCompatActivity() {
    private val splashscreen=4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            startActivity(intent)
            val intent = Intent(this@Splashscreen, login::class.java)
            startActivity(intent)
            finish()
        }, splashscreen.toLong())
    }
}