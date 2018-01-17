package com.example.anmol.childmonitor.otpVerification

import android.content.Context
import com.example.anmol.childmonitor.SMS.smsReceiver
import com.example.anmol.childmonitor.SMS.smsSend

class otpModel : otpMVP.model{
    override fun sendSMS(ph:String,otp:String, ct: Context) {
            var send: smsSend = smsSend(ct)
            send.sendSMS(ph,otp)
    }
    override fun recieveSMS() : Int {
        //return smsReceiver().;
        return 0;
    }
}
