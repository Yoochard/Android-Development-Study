package com.example.tutorial3_yangyuqing

import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), myFragment1.OnFragmentInteractionListener {

    var receiver : MyBroadcastReceiver? = null

    override fun onFragmentInteraction(uri: Uri) {
        val str : String = uri.toString()
        Log.i("MainActivity","Uri.toString() is: " + str)
        val intent = Intent()
        intent.action = "TestAction"
        intent.putExtra("UserInputString", str)
        intent.flags = Intent.FLAG_INCLUDE_STOPPED_PACKAGES
        sendBroadcast(intent)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        val myFragment1 = myFragment1()
        transaction.add(R.id.myFragment1, myFragment1)
        transaction.commit()
    }

    override fun onResume() {
        super.onResume()
        val filter = IntentFilter()
        filter.addAction("TestAction")
        receiver = MyBroadcastReceiver()
        registerReceiver(receiver,filter)

    }

    override fun onStop() {
        unregisterReceiver(receiver)
        super.onStop()
    }

}
