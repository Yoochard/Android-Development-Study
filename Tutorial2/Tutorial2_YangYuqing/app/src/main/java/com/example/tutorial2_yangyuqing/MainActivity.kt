package com.example.tutorial2_yangyuqing

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_1 = findViewById<Button>(R.id.button1)
        btn_1.setOnClickListener{
            val myIntent = Intent(this, Activity1::class.java)
            startActivity(myIntent)
        }

        val btn_2 = findViewById<Button>(R.id.button2)
        btn_2.setOnClickListener{
            val myIntent = Intent(this, Activity2::class.java)
            val userInputTextView = findViewById<TextView>(R.id.userInput)
            var userInput = 1;
            if(!userInputTextView.text.toString().equals("")){
                userInput = userInputTextView.text.toString().toInt()
            }

            myIntent.putExtra("userInput", userInput)
            startActivityForResult(myIntent, REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if ((requestCode == REQUEST_CODE) && (resultCode == Activity.RESULT_OK)){
            if (data?.hasExtra("returnResult") != null) {
                val myIntent = Intent(this, Activity2::class.java)
                var userInput = data?.extras?.getInt("userInput",1)
                val returnResult = data?.extras?.getInt("returnResult",1)
                Toast.makeText(this, "factorial of " +
                        userInput + " = " + returnResult, Toast.LENGTH_LONG).show()
            }
        }
    }
}
