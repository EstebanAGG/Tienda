class Ropa(nombre: String, precio: Double, cantidad: Int, private var color: String)
    : Producto(nombre, precio, cantidad) {

    override fun toString(): String {
        return "Ropa: ${this.getNombre()}, precio: ${this.getPrecio()}," +
                " cantidad: ${this.getCantidad()}, color: $color"
    }
}