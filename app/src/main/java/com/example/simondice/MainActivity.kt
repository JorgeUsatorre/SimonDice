// En el paquete principal
package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.myapplication.model.SimonViewModel
import com.example.myapplication.ui.theme.Greeting
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    private val viewModel: SimonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApplicationTheme {
                Greeting(viewModel = viewModel)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Estado", "Funcion on Destroy")
    }
}
