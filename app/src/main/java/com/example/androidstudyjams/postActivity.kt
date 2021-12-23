package com.example.androidstudyjams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class postActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val titleList = ArrayList<String>()
        val descriptionList=ArrayList<String>()
        val authorList=ArrayList<String>()
        for (i in 0 until  100) {
            titleList.add("title $i")
            descriptionList.add("description $i")
            authorList.add("author $i")}


        val adapter:PostAdapter= PostAdapter(titleList,descriptionList,authorList)
        recyclerView.adapter=adapter
    }
}