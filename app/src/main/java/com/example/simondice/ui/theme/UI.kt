package com.example.myapplication.ui.theme


import android.util.Log
import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.model.SimonViewModel

@Composable
fun Greeting(viewModel: SimonViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Buttons(viewModel)
        Textos(viewModel)
    }
}

@Composable
fun Buttons(miModel: SimonViewModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth() // Ocupa todo el ancho disponible
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth() // Ocupa todo el ancho disponible
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween // Espacio horizontal entre elementos
        ) {
            Button(
                onClick = { miModel.randomLista() }, // Acción al hacer clic en el botón
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .background(Color.White) // Establece el color de fondo en blanco
            ) {
                Text(text = "Tonal_List") // Texto del botón
            }

            OutlinedButton(
                onClick = { miModel.random() }, // Acción al hacer clic en el botón
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .background(Color.White) // Establece el color de fondo en blanco
            ) {
                Text(text = "Random") // Texto del botón
            }
        }

        Spacer(modifier = Modifier.height(8.dp)) // Espacio vertical de 8dp

        Row(
            modifier = Modifier
                .fillMaxWidth() // Ocupa todo el ancho disponible
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween // Espacio horizontal entre elementos
        ) {


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Textos(viewModel: SimonViewModel) {
    Column {
        Text(
            fontSize = 40.sp, // Tamaño de fuente de 40sp
            text =  viewModel.getRandom().toString(),// Texto generado por el modelo
            modifier = Modifier.align(Alignment.CenterHorizontally) // Centra el texto horizontalmente
        )

        OutlinedTextField(
            value = viewModel.getNombre(), // Valor del campo de texto
            onValueChange = { viewModel.nombre.value = it }, // Acción al cambiar el valor del campo
            modifier = Modifier
                .fillMaxWidth() // Ocupa todo el ancho disponible
                .padding(8.dp)
        )

        Text(
            text = "Result: " + viewModel.getNombre(), // Texto del resultado
            modifier = Modifier.align(Alignment.CenterHorizontally) // Centra el texto horizontalmente
        )

        Text(
            text = viewModel.getLista().toString(), // Texto que muestra la lista
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally) // Centra el texto horizontalmente
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(miModel: SimonViewModel) {
    MyApplicationTheme{
        Greeting(viewModel = miModel)
    }
}