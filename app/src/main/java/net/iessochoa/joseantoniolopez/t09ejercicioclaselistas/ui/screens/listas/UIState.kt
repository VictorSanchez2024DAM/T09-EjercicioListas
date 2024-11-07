package net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.ui.screens.listas

import net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.data.entities.Frase

data class ListaUiState(
    val lista: List<Frase> = listOf()
)