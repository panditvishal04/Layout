package com.vishal.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var image : ImageView
    lateinit var image1:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image=findViewById(R.id.main_header)
        image1=findViewById(R.id.img_v)

    }
}