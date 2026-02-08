abstract class Producto(private var nombre: String = "",
                        private var precio : Double = 0.0,
                        private var cantidad: Int = 0){

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

