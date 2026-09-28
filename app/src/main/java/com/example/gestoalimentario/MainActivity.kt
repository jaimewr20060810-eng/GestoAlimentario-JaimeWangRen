package com.example.gestoalimentario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gestoalimentario.model.Receta
import com.example.gestoalimentario.model.Estado
import com.example.gestoalimentario.ui.theme.components.elementoCard
import com.example.gestoalimentario.ui.theme.screen.MainScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

                    MainScreen(
                        modifier = Modifier
                            .fillMaxSize()

                            .padding(8.dp),

                        elementos = listOf(

                            Receta(
                                nombre = "Leche",
                                categoria = "Lácteos",
                                fecha_compra = "25/09/2026",
                                fecha_caducado = "29/09/2026",
                                estado = Estado.NO_CADUCADO
                            ),

                            Receta(
                                nombre = "Tomates",
                                categoria = "Verduras",
                                fecha_compra = "26/09/2026",
                                fecha_caducado = "30/09/2026",
                                estado = Estado.NO_CADUCADO
                            ),

                            Receta(
                                nombre = "Pollo",
                                categoria = "Carne",
                                fecha_compra = "24/09/2026",
                                fecha_caducado = "28/09/2026",
                                estado = Estado.CADUCADO
                            ),

                            Receta(
                                nombre = "Yogur natural",
                                categoria = "Lácteos",
                                fecha_compra = "26/09/2026",
                                fecha_caducado = "01/10/2026",
                                estado = Estado.NO_CADUCADO
                            ),

                            Receta(
                                nombre = "Manzanas",
                                categoria = "Frutas",
                                fecha_compra = "23/09/2026",
                                fecha_caducado = "04/10/2026",
                                estado = Estado.NO_CADUCADO
                            )

                        )
                    )
                }
            }
        }


