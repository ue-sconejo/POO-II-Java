import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductoManager gestorProductos = new ProductoManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar producto\n2. Ver productos\n3. Buscar\n4. Eliminar\n5. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese Nombre:");
                String nombreProducto = scanner.next();

                System.out.println("Ingrese Precio:");
                double precioProducto = scanner.nextDouble();

                System.out.println("Ingrese Categoría:");
                String categoria = scanner.next();

                gestorProductos.agregarProducto(nombreProducto, 
                precioProducto, categoria);
            } else if (opcion == 2) {
                gestorProductos.mostrarProductos();
            } else if (opcion == 3) {
                System.out.println("Ingrese ID del Producto:");
                int id = scanner.nextInt();
                Producto productoBusqueda = gestorProductos.buscarProductoPorId(id);
                if (productoBusqueda != null) {
                    productoBusqueda.toString();
                } else {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 4) {
                System.out.println("Ingrese ID del Producto a eliminar:");
                gestorProductos.eliminarProductoPorId(scanner.nextInt());
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }
        }
    }
}
