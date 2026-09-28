package com.example.gestoalimentario.ui.theme.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gestoalimentario.model.Receta
import com.example.gestoalimentario.model.Estado
import com.example.gestoalimentario.ui.theme.components.elementoCard

@Composable
fun MainScreen(
    modifier: Modifier,
    elementos: List<Receta>
) {

    Column(
        modifier = modifier
    ) {

        Text(
            text = "GestoAlimentario",
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        ElementosList(
            modifier = Modifier.fillMaxWidth(),
            elementos = elementos
        )
    }
}


@Composable
fun ElementosList(
    modifier: Modifier,
    elementos: List<Receta>
) {

    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = androidx.compose.foundation.layout.PaddingValues(
            horizontal = 16.dp,
            vertical = 8.dp
        )
    ) {

        items(elementos) { elemento ->

            elementoCard(
                modifier = Modifier.fillMaxWidth(),
                elemento = elemento
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ElementosListPreview() {

    ElementosList(
        modifier = Modifier,
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
            )
        )
    )
}