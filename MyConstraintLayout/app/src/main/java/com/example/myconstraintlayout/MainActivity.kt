package com.example.myconstraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//earliest method one can change in Android
        setContentView(R.layout.activity_main)//R stands for Resource
    }
}
