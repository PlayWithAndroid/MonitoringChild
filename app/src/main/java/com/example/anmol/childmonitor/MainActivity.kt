package com.example.anmol.childmonitor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var phoneNumber: EditText? = null;
    var btn: Button? = null;

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
    }
}
