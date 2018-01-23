package com.example.anmol.childmonitor

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var phoneNumber: EditText? = null;
    var btn: Button? = null;

    var broadcast:BroadcastReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phoneNumber = findViewById<EditText>(R.id.editText)
        btn = findViewById<Button>(R.id.button)

        btn?.setOnClickListener({
            Toast.makeText(this,"Button Clicked" , Toast.LENGTH_LONG).show()

            //Taking Phone Number
            val ph = phoneNumber?.text;

            //Sending the SMS

            //Receiving the SMS
        })

        broadcast = object : BroadcastReceiver(){
            override fun onReceive(p0: Context?, p1: Intent?) {
                var senderName : String = p1!!.getStringExtra("phoneNumber")
                var message: String = p1!!.getStringExtra("message")
                println(message)
                sendOTP(message)
            }
        }

    }

    // OTP VERIFICATION
    fun sendOTP(message:String){
        //FOR NOW 1234
        if (message.equals("1234")){
            println("OTP VERIFIED")
        }
    }

    override fun onResume() {
        super.onResume()
        val intentFilter : IntentFilter = IntentFilter("smsReceiver")
        registerReceiver( broadcast , intentFilter)
    }

    override fun onPause() {
        unregisterReceiver(broadcast)
        super.onPause()
    }
}
