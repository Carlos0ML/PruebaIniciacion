package com.cmlapps.myapplication

import Repositorio.RepositorioPelicula
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@InstallIn (ActivityComponent::class)
@Module

abstract class DataModule {

    @Binds

    abstract  fun bindRespositorioPelicula (impl: RepositorioPeliculaimpl): RepositorioPelicula

}

