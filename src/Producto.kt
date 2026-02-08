abstract class Producto(nombre: String, precio : Double = 0.0, cantidad: Int = 0){
    var nombre: String = nombre
        get() = field
        set(value) {field = value.uppercase()}
    var precio: Double = precio
        get() = field
        set(value) {field = value}
    var cantidad: Int = cantidad
        set(value) {
            if (value >= 0) field = value
        }

    fun modificarCantidad(cantidad: Int) {
        this.cantidad = cantidad
    }
}

