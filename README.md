 Cupcake App

App de ejemplo para pedir magdalenas usando Jetpack Compose y navegación con NavHost.



 Descripción

La app Cupcake permite a los usuarios seleccionar la cantidad, sabor y fecha de retiro de magdalenas en cuatro pantallas distintas, navegando entre ellas mediante un componente de navegación basado en rutas. La app está diseñada con buenas prácticas de Compose, ViewModel y UI modular.


 Estructura del proyecto

- `CupcakeScreen.kt`  
  Define las rutas de navegación y el NavHost que contiene las pantallas principales.

- `StartOrderScreen.kt`  
  Pantalla inicial para seleccionar la cantidad de magdalenas.

- `SelectOptionScreen.kt`  
  Pantalla reutilizable para elegir sabor o fecha de retiro.

- `OrderSummaryScreen.kt`  
  Pantalla para revisar el resumen del pedido y enviarlo o cancelarlo.

- `CommonUi.kt`  
  Componentes UI reutilizables, como el formato de precio.

- `DataSource.kt`  
  Datos estáticos como cantidades y sabores disponibles.

- `OrderUiState.kt`  
  Clase de datos que representa el estado actual del pedido.

- `OrderViewModel.kt`  
  Lógica para actualizar el estado del pedido y calcular precios.



Funcionalidades principales

- Navegación entre pantallas con Jetpack Compose Navigation.
- Selección de cantidad, sabor y fecha de retiro.
- Visualización dinámica del subtotal del pedido.
- Resumen final con opción de enviar o cancelar el pedido.

 Cómo usar

1. Clona el repositorio.
2. Abre el proyecto en Android Studio.
3. Asegúrate de tener configurado Jetpack Compose y las dependencias de Navigation.
4. Ejecuta la app en un emulador o dispositivo físico.
5. Navega por las pantallas para hacer un pedido de magdalenas.


Licencia

Este proyecto es un ejemplo educativo y puede ser usado libremente.



 Créditos

Basado en el codelab oficial de Jetpack Compose Navigation para la app Cupcake.

