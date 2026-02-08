class Inventario {
    private val listaProductos: MutableList<Producto> = mutableListOf()

    fun addProducto(producto: Producto) {
        listaProductos.add(producto)
    }

    fun mostrarProductos(){
        listaProductos.forEach {
            println("Producto: $it")
        }
    }

    fun modificarCantidad(nombreProducto: String, nuevaCantidad: Int){
        listaProductos.first{ it.getNombre() == nombreProducto }
            .modificarCantidad(nuevaCantidad)
    }
}