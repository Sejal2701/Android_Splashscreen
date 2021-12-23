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
    lateinit var handler : Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler()
        handler.postDelayed({

            val intent = Intent(this,postActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000 )
    }
}




