package com.example.cmlapps

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            Log.d("Carlos", "Se ha creado una actividad")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("Carlos","Se ha modificado la configuración")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Carlos","Se ha modificado la configuración")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Carlos","La actividad ha salido del estado visible")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Carlos","La actividad ya no está en primer plano")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Carlos","La actividad se ha destruido")
    }

}