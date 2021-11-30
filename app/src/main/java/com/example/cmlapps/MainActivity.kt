package com.example.cmlapps

import CasoDeUso.GetCasoDeUsoPelicula
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var log: PersonalLog
    @Inject
    lateinit var casouso: GetCasoDeUsoPelicula

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log.log("onCreate")
        val peli = casouso.execute()
        log.log("El nombre de la película es ${peli.titulo}")
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