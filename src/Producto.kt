abstract class Producto(nombre: String, precio: Double = 0.0, cantidad: Int = 0) {
    private var _nombre = nombre
    private var _precio = precio
    private var _cantidad = cantidad

    //Accesores públicos con lógica
    var nombre: String
        get() = _nombre
        set(value) {
            _nombre = value
        }
    var precio: Double
        get() = _precio
        set(value) {
            _precio = value
        }
    var cantidad: Int
        get() = _cantidad
        set(value) {
            _cantidad = value
        }
//    var nombre: String = nombre
//        get() = field
//        set(value) {field = value.uppercase()}
//    var precio: Double = precio
//        get() = field
//        set(value) {field = value}
//    var cantidad: Int = cantidad
//        set(value) {
//            if (value >= 0) field = value
//        }

    fun modificarCantidad(cantidad: Int) {
        this.cantidad = cantidad
    }
}

