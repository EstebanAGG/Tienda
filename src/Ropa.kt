class Ropa(nombre: String, precio: Double, cantidad: Int, color: String)
    : Producto(nombre, precio, cantidad) {

    var color: String = color
        set(value) {
            field = value.lowercase()
        }

    override fun toString(): String {
        return "Ropa: ${this.nombre}, precio: ${this.precio}," +
                " cantidad: ${this.cantidad}, color: $color"
    }
}