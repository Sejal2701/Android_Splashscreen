package com.example.androidstudyjams

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.WindowManager
import android.content.Intent
import android.icu.util.UniversalTimeScale.toLong

import android.os.Build
import android.os.Handler
import androidx.annotation.RequiresApi


class Splashscreen : AppCompatActivity() {
    private val splashscreen=4000

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed({
            startActivity(intent)
            val intent = Intent(this@Splashscreen, login::class.java)
            startActivity(intent)
            finish()
        }, splashScreen.toString())
    }
}


