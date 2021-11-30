package CasoDeUso

import Repositorio.RepositorioPelicula
import javax.inject.Inject


class GetCasoDeUsoPelicula @Inject constructor(

    private val RepositorioPelicula: RepositorioPelicula

) {

    fun execute() = RepositorioPelicula.getPelicula()

}
