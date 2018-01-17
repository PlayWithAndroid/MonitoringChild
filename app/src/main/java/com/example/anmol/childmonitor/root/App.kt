package com.example.anmol.childmonitor.root

import android.app.Application


class App : Application() {

    var appComponent:ApplicationComponent? =  null;
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.builder()
                        .applicationModule(ApplicationModule(this))
                        .build()
    }
}