package com.example.cmlapps

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var log: PersonalLog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log.log("onCreate")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        log.log("ConfigurationChanged")
    }

    override fun onStart() {
        super.onStart()
        log.log("onStart")
    }

    override fun onStop() {
        super.onStop()
        log.log("onStop")
    }

    override fun onPause() {
        super.onPause()
        log.log("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        log.log("onDestroy")
    }



}