package com.example.tutorial2_yangyuqing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)


        val btn_showImage1 = findViewById<Button>(R.id.button3)
        btn_showImage1.setOnClickListener{
            val imageView1 = findViewById<ImageView>(R.id.image1)
            imageView1.setImageResource(R.drawable.meteora)
        }

        val btn_showImage2 = findViewById<Button>(R.id.button4)
        btn_showImage2.setOnClickListener{
            val imageView2 = findViewById<ImageView>(R.id.image2)
            imageView2.setImageResource(R.drawable.penang_hill)
        }

        val btn_back = findViewById<Button>(R.id.back_button)
        btn_back.setOnClickListener{
            finish()
        }
    }
}
