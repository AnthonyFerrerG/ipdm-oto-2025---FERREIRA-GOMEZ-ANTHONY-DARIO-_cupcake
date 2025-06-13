package com.example.cupcake.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(OrderUiState())
    val uiState: StateFlow<OrderUiState> = _uiState

    fun setQuantity(quantity: Int) {
        _uiState.update { it.copy(quantity = quantity, price = calculatePrice(quantity, it.flavor)) }
    }

    fun setFlavor(flavor: String) {
        _uiState.update { it.copy(flavor = flavor, price = calculatePrice(it.quantity, flavor)) }
    }

    fun setDate(date: String) {
        _uiState.update { it.copy(date = date) }
    }

    fun resetOrder() {
        _uiState.value = OrderUiState()
    }

    private fun calculatePrice(quantity: Int, flavor: String): Double {
        val basePrice = 2.0
        return quantity * basePrice // Ejemplo simple, se puede ajustar según sabor
    }
}
