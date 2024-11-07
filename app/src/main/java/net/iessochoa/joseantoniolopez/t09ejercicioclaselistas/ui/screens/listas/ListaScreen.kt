package net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.ui.screens.listas

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ListaScreen(
    viewModel: ListaViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.stateUi.collectAsState()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

    }

}