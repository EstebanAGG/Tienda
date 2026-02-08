fun main() {
    val inventario = Inventario()
    var opcion: Int

    do {
        println("\nSistema de Inventario de Tienda")
        println("1. Agregar producto")
        println("2. Mostrar todos los productos")
        println("3. Modificar cantidad de un producto")
        println("4. Salir")
        print("Seleccione una opción: ")

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                print("Ingrese el tipo de producto (1: Tipo 1, 2: Tipo 2): ")
                val tipo = readLine()?.toIntOrNull() ?: continue
                if (tipo in 1..2) {
                    print("Nombre del producto: ")
                    val nombre = readLine() ?: continue

                    print("Precio del producto: ")
                    val precio = readLine()?.toDoubleOrNull() ?: continue

                    print("Cantidad del producto: ")
                    val cantidad = readLine()?.toIntOrNull() ?: continue

                    when (tipo) {
                        1 -> {
                            // Generar código para caso 1 --> Electronico
                            print("Encendido Ss/N: ")
                            val encendido = readLine() ?: continue
                            val estaEncendido = encendido.uppercase() == "S"
                            val nuevoProducto = Electronico(nombre, precio, cantidad, estaEncendido)
                            inventario.addProducto(nuevoProducto)
                        }

                        2 -> {
                            // Generar código para caso 2
                            print("Ingrese el color: ")
                            val color = readLine() ?: continue
                            val nuevoProducto = Ropa(nombre, precio, cantidad, color)
                            inventario.addProducto(nuevoProducto)
                        }

                        else -> println("Tipo de producto no válido.")
                    }
                }else println("Tipo de producto no válido.")
            }
            2 -> {
                if (inventario.esVacio()) println("No hay productos.")
                else inventario.mostrarProductos()
            }
            3 -> {
                print("Nombre del producto a modificar: ")
                val nombreProducto = readLine() ?: continue

                print("Nueva cantidad: ")
                val nuevaCantidad = readLine()?.toIntOrNull() ?: continue

                inventario.modificarCantidad(nombreProducto, nuevaCantidad)
            }
            4 -> println("Saliendo del sistema.")
            else -> println("Opción no válida.")
        }
    } while (opcion != 4)
}