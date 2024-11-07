package net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.ui.screens.listas


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.data.Datasource

class ListaViewModel(): ViewModel(){

    val _stateUi= MutableStateFlow(ListaUiState(
        lista = Datasource().loadFrases()
    ))
    val stateUi: StateFlow<ListaUiState> =_stateUi


}