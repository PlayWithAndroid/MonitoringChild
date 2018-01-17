package com.example.anmol.childmonitor.root

import com.example.anmol.childmonitor.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent{
    fun inject(target: MainActivity)
}
