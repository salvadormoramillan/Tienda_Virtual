package com.example.tienda_virtual

import HomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tienda_virtual.data.Producto
import com.example.tienda_virtual.navegation.Navegacion
import com.example.tienda_virtual.ui.theme.Tienda_VirtualTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val productos = listOf(
            Producto(1, "Zapatos", 50, R.drawable.zapatos,"zapatos de payaso ideal para eventos"),
            Producto(2, "Camiseta", 30, R.drawable.camiseta,"camisetas de payaso ideal para eventos"),
            Producto(3, "Pantalón", 40, R.drawable.pantalones,"pantalones de payaso ideal para eventos"),
            Producto(1, "Zapatos", 50, R.drawable.zapatos,"zapatos de payaso ideal para eventos"),
            Producto(2, "Camiseta", 30, R.drawable.camiseta,"camisetas de payaso ideal para eventos"),
            Producto(3, "Pantalón", 40, R.drawable.pantalones,"pantalones de payaso ideal para eventos"),
            Producto(1, "Zapatos", 50, R.drawable.zapatos,"zapatos de payaso ideal para eventos"),
            Producto(2, "Camiseta", 30, R.drawable.camiseta,"camisetas de payaso ideal para eventos"),
            Producto(3, "Pantalón", 40, R.drawable.pantalones,"pantalones de payaso ideal para eventos"),
            Producto(1, "Zapatos", 50, R.drawable.zapatos,"zapatos de payaso ideal para eventos"),
            Producto(2, "Camiseta", 30, R.drawable.camiseta,"camisetas de payaso ideal para eventos"),
            Producto(3, "Pantalón", 40, R.drawable.pantalones,"pantalones de payaso ideal para eventos"),
            Producto(1, "Zapatos", 50, R.drawable.zapatos,"zapatos de payaso ideal para eventos"),
            Producto(2, "Camiseta", 30, R.drawable.camiseta,"camisetas de payaso ideal para eventos"),
            Producto(3, "Pantalón", 40, R.drawable.pantalones,"pantalones de payaso ideal para eventos")
        )
        setContent {
            Tienda_VirtualTheme {
                Navegacion(productos)

            }
        }

    }
}

