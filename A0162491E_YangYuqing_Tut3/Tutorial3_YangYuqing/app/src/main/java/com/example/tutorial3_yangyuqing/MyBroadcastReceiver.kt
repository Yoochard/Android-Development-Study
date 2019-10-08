package com.example.tutorial3_yangyuqing

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "In onReceive of MyBroadcastReceiver, message received is: " + intent?.getStringExtra("UserInputString"), Toast.LENGTH_LONG).show()
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}