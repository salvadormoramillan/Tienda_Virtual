package com.example.tienda_virtual.navegation

import HomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tienda_virtual.Screen.DetallesScreen
import com.example.tienda_virtual.data.Producto
import com.example.tienda_virtual.R
import com.example.tienda_virtual.Screen.CompradoScreen

@Composable
fun Navegacion(productos: List<Producto>) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Rutas.Home.route
    ) {

        composable(Rutas.Home.route) {
            HomeScreen(
                productos = productos,
                onProductoClick = { productoId ->
                    navController.navigate(Rutas.Detalle.crearRuta(productoId))
                }
            )
        }

        composable(
            route = Rutas.Detalle.route,
            arguments = listOf(
                navArgument("productoId") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->

            val productoId =
                backStackEntry.arguments?.getInt("productoId") ?: return@composable


            val producto = productos.find { it.id == productoId }

            producto?.let {
            DetallesScreen(
                producto = it,
                onHomeClick = {
                    navController.navigate(Rutas.Home.route) {
                        popUpTo(Rutas.Home.route) { inclusive = true }
                    }
                },
                onHistoriaClick = {
                    navController.navigate(Rutas.Comprado.route)
                }
            )
           }
        }
        composable(Rutas.Comprado.route) {
            CompradoScreen(
                onVolverClick = {
                    navController.navigate(Rutas.Home.route) {
                        popUpTo(Rutas.Home.route) { inclusive = true }
                    }
                }
            )
        }
    }
}
