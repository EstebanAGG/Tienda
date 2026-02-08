import java.util.function.IntToLongFunction

abstract class Producto(nombre: String = "", precio : Double = 0.0, cantidad: Int = 0){
    private var nombre: String = nombre
        get() = field
        set(nombre) {field = nombre}
    private var precio: Double = precio
        get() = field
        set(precio) {field = precio}
    private var cantidad: Int = cantidad
        get() = field
        set(cantidad) {field = cantidad}
}