
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tienda_virtual.data.Producto

@Composable
fun TiendaApp() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {

    val productos = listOf(
        Producto("Producto 1", "Precio 1"),
        Producto("Producto 2", "Precio 2"),
        Producto("Producto 3", "Precio 3"),
        Producto("Producto 1", "Precio 1"),
        Producto("Producto 2", "Precio 2"),
        Producto("Producto 3", "Precio 3"),
        Producto("Producto 1", "Precio 1"),
        Producto("Producto 2", "Precio 2"),
        Producto("Producto 3", "Precio 3"),
        Producto("Producto 1", "Precio 1"),
        Producto("Producto 2", "Precio 2"),
        Producto("Producto 3", "Precio 3"),
        Producto("Producto 1", "Precio 1"),
        Producto("Producto 2", "Precio 2"),
        Producto("Producto 3", "Precio 3")
    )
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text(
                text = "Catálogo disponible:",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(productos) { producto ->
                    ProductoItem(producto)
                }
            }
        }
    }
}

@Composable
fun ProductoItem(producto: Producto) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Imagen del producto
            /*Image(
                painter = painterResource(id = producto.imagenRes),
                contentDescription = producto.nombre,
                modifier = Modifier
                    .size(64.dp)
            )*/

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = producto.nombre,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = producto.precio,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.primary
                )
            }

            Button(
                onClick = {  }
            ) {
                Text(text = "Ver")
            }
        }
    }
}
