package com.example.oopdemo

import android.util.Log

class MyCar : Car(){
    override fun start() {
        Log.i( "MyTag", "this is MyCar Starting")
    }
}