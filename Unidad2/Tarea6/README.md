# TAREA 6

Clase Producto

- Atributos:
Nombre: Una cadena que representa el nombre del producto.
Precio: Un número de punto flotante que representa el precio del producto.
Stock: Un número entero que representa la cantidad de existencias disponibles del producto.
Constructores:

- Un constructor que tome tres parámetros (nombre, precio y stock) para inicializar todos los atributos del producto.
- Un constructor que tome dos parámetros (nombre y precio) y establezca el stock en 0 por defecto.

- Métodos:
aumentarStock(int cantidad): Aumenta el stock del producto en la cantidad especificada, con validación para asegurarse de que la cantidad sea mayor que cero.
reducirStock(int cantidad): Reduce el stock del producto en la cantidad especificada, con validación para asegurarse de que la cantidad sea mayor que cero y menor o igual al stock actual.

- Getters y setters para todos los atributos:
getNombre() y setNombre(String nombre).
getPrecio() y setPrecio (double precio).
getStock() y setStock(int stock).
Métodos adicionales:

- Validaciones:
El precio y el stock no pueden ser negativos.
El nombre no puede ser nulo.
La cantidad a reducir del stock debe ser menor o igual al stock actual.

- Notas:
La clase se llama "Producto".
Los atributos son privados.
Los métodos son públicos.
Se incluyen validaciones para los setters.
