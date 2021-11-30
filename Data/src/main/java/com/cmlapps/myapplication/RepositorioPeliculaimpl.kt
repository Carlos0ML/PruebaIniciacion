package com.cmlapps.myapplication

import Repositorio.RepositorioPelicula
import com.cmlapps.lib.Pelicula

class RepositorioPeliculaimpl: RepositorioPelicula {
    override fun getPelicula(): Pelicula {

        return Pelicula (

            titulo = "DAM",
            url = "www.google.com",
            rating = 8.0,
            nombredeldirector = "Jose"

        )
    }
}

