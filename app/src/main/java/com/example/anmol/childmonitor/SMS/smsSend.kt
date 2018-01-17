package com.example.anmol.childmonitor.SMS

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.telephony.SmsManager
import android.widget.Toast

import com.example.anmol.childmonitor.MainActivity

class smsSend (internal var ctx: Context) {
    // Sending SMS
    fun sendSMS(number: String, message: String) {
        val intent = Intent(ctx, MainActivity::class.java)
        val pi = PendingIntent.getActivities(ctx, 0, arrayOf(intent), 0)
        val sms = SmsManager.getDefault()
        sms.sendTextMessage(number, null, message, pi, null)
        Toast.makeText(ctx, "Message Sent successfully!",
                Toast.LENGTH_LONG).show()
    }
}