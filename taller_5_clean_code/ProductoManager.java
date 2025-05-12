import java.util.*;

public class ProductoManager {
    private List<Producto> productos = new ArrayList<>();
    private int proximoId = 0;

    public void agregarProducto(String nombre, double precio, String categoria) {
        Producto producto = new Producto(proximoId++, nombre, precio, categoria);
        productos.add(producto);
        System.out.println("Producto agregado.");
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Producto buscarProductoPorId(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    public void eliminarProductoPorId(int id) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("Producto eliminado.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
}