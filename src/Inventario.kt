class Inventario {
    private val listaProductos: MutableList<Producto> = mutableListOf()

    fun addProducto(producto: Producto) {
        listaProductos.add(producto)
    }

    fun mostrarProductos(){
        println("LISTADO DE PRODUCTOS")
        println("---------------------")
        listaProductos.forEach {
            println("Producto: $it")
        }
    }

    fun modificarCantidad(nombreProducto: String, nuevaCantidad: Int){
        listaProductos.firstOrNull(){ it.getNombre() == nombreProducto }
            ?.modificarCantidad(nuevaCantidad) ?: println("El producto no existe.")
    }

    fun esVacio():Boolean = listaProductos.isEmpty()
}