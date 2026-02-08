class Ropa(nombre: String, precio: Double, cantidad: Int, color: String) : Producto(nombre, precio, cantidad) {
    var color: String = color
        get() = field
        set(color) {field = color}

    override fun toString(): String {
        return "Ropa: ${this.getNombre()}, precio: ${this.getPrecio()}," +
                " cantidad: ${this.getCantidad()}, color: $color"
    }
}