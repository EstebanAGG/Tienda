class Electronico(nombre: String, precio: Double, cantidad: Int, encendido: Boolean): Producto(nombre, precio, cantidad)
{
    private var encendido: Boolean = encendido
        get() = field
        set(encendido) {field = encendido}

    override fun toString(): String {
        return "Electrónico: ${this.getNombre()}, precio: ${this.getPrecio()}, " +
                "cantidad: ${this.getCantidad()}, encendido: ${if (encendido) "sí" else "no"}"
    }
}