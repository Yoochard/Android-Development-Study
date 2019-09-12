package com.example.tutorial2_yangyuqing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val btn_back = findViewById<Button>(R.id.btn_back)
        btn_back.setOnClickListener{
            var userInput : Int = intent.getIntExtra("userInput", 1)
            var i = 1
            var factorialResult = 1
            while (i <= userInput) {
                factorialResult *= i
                i++
            }
            val myIntent = Intent()
            myIntent.putExtra("userInput", userInput)
            myIntent.putExtra("returnResult", factorialResult)
            // Toast.makeText(this, "return Result is " + factorialResult, Toast.LENGTH_LONG).show()
            setResult(RESULT_OK, myIntent)

            finish()
        }

        val imageView1 = findViewById<ImageView>(R.id.image1)
        imageView1.setImageResource(R.drawable.meteora)

        /*
            dynamic fragment in Activity 2
         */
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        val fragment2 = Fragment2()
        transaction.add(R.id.frameLayout1, fragment2)
        transaction.commit()
    }

}
