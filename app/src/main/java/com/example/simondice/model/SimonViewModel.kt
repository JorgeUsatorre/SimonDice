// En el paquete `model`
package com.example.myapplication.model

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SimonViewModel : ViewModel() {
    var isStarted: Boolean = false
    var nombre = mutableStateOf("")
    var aleatorio = mutableStateOf(0)
    var lista = mutableStateListOf<Int>()

    fun random() {
        aleatorio.value = ((0..10).random())
        Log.d("Estado", aleatorio.value.toString())
    }

    fun randomLista() {
        aleatorio.value = ((0..8).random())
        lista.add(aleatorio.value)
        Log.d("Estado", "Números Lista: " + aleatorio.value.toString())
    }

    fun getLista(): List<Int> {
        return lista.toList()
    }

    fun getRandom(): Int {
        return aleatorio.value
    }

    fun getNombre(): String {
        return nombre.value
    }

    fun reset() {
        // Implementa la lógica de reinicio si es necesario
    }

    private var ronda = mutableStateOf(0)

    fun getRonda(): Int {
        return ronda.value
    }

    fun sumarRonda() {
        ronda.value += 1
    }
}
