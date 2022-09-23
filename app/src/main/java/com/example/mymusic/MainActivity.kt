package com.example.mymusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymuisc.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MyMuisc)
        setContentView(R.layout.activity_main)
    }
}