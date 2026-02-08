abstract class Producto(nombre: String = "", precio : Double = 0.0, cantidad: Int = 0){
    private var nombre: String = nombre
    private var precio: Double = precio
    private var cantidad: Int = cantidad

    fun getNombre(): String{
        return nombre
    }

    fun getPrecio(): Double{
        return precio
    }

    fun getCantidad(): Int {
        return cantidad
    }

    fun modificarCantidad(cantidad: Int) {
        this.cantidad = cantidad
    }
}

