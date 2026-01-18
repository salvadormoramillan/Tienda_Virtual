package com.example.tienda_virtual.navegation

sealed class Rutas(val route: String) {

    object Home : Rutas("home")

    object Detalle : Rutas("detalle/{productoId}") {
        fun crearRuta(productoId: Int) = "detalle/$productoId"
    }
}
