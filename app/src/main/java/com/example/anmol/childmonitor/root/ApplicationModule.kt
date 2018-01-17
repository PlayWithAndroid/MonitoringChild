package com.example.anmol.childmonitor.root

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule (val application:Application){
    @Provides
    @Singleton
    fun provideContext() : Context{
        return application;
    }
}
