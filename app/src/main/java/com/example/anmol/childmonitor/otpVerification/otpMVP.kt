package com.example.anmol.childmonitor.otpVerification


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
        fun sendSMS()
        fun recieveSMS()
    }

}
