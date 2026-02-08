class Electronico(nombre: String, precio: Double, cantidad: Int, private var encendido: Boolean)
    : Producto(nombre, precio, cantidad)
{
    override fun toString(): String {
        return "Electrónico: ${this.getNombre()}, precio: ${this.getPrecio()}, " +
                "cantidad: ${this.getCantidad()}, encendido: ${if (encendido) "sí" else "no"}"
    }
}