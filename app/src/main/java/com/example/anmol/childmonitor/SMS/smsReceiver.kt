package com.example.anmol.childmonitor.SMS

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.telephony.SmsManager
import android.telephony.SmsMessage
import android.util.Log

class smsReceiver : BroadcastReceiver() {

    internal val sms = SmsManager.getDefault()

    @RequiresApi(api = Build.VERSION_CODES.M)
    override fun onReceive(context: Context, intent: Intent) {


        val bundle = intent.extras

        val intent1 = Intent("smsReceiver")

        try {

            if (bundle != null) {

                val pdusObj = bundle.get("pdus") as Array<Any>

                for (i in pdusObj.indices) {

                    val format = bundle.getString("format")

                    val currentMessage = SmsMessage.createFromPdu(pdusObj[i] as ByteArray, format)

                    // Phone Number
                    val phoneNumber = currentMessage.displayOriginatingAddress

                    val senderNum = phoneNumber

                    // Message
                    val message = currentMessage.displayMessageBody

                    // Sending Phone Number
                    intent1.putExtra("phoneNumber", phoneNumber)

                    // Sending Message OTP
                    intent1.putExtra("message", message)


                    // Sending Broad cast whosoever want to receive this Broadcast will get it like OTP Verification will receive
                    // it
                    context.sendBroadcast(intent1)

                }
            }

        } catch (e: Exception) {
            Log.e("SmsReceiver", "Exception smsReceiver" + e)

        }
    }
}