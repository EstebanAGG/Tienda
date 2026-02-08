class Electronico(nombre: String, precio: Double, cantidad: Int, private var encendido: Boolean)
    : Producto(nombre, precio, cantidad)
{
    override fun toString(): String {
        return "Electrónico: ${this.nombre}, precio: ${this.precio}, " +
                "cantidad: ${this.cantidad}, encendido: ${if (encendido) "Sí" else "No"}"
    }
}