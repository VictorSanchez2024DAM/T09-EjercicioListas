package net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.ui.screens.listas

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

@Composable
fun ListaScreen(
    viewModel: ListaViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.stateUi.collectAsState()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        LazyColumn(modifier =
        Modifier
            .fillMaxSize()
            .padding(innerPadding),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(8.dp)
        )
        {
            items(uiState.lista) { item ->
                ItemCard(
                    item
                )
            }
        }

        //Version sin Lazy
        /* val scrollState = rememberScrollState()
         Column(
             modifier = Modifier
                 .fillMaxSize()
                 .padding(innerPadding)
                 .verticalScroll(scrollState)

         ){
             uiState.lista.forEach{
                 ItemCard(it)
             }
         }*/

    }

}