package com.example.anmol.childmonitor.otpVerification

import android.content.Context


interface otpMVP{

    //View
    interface view{
        fun setPhoneNumber()
        fun validOTP()
        fun invalidOTP()
    }

    //Presenter
    interface presenter{
        fun sendButtonClicked()
        fun checkOTP()
    }

    //Model
    interface model{
        fun sendSMS(ph:String,otp:String,ct: Context)
        fun recieveSMS():Int
    }

}
