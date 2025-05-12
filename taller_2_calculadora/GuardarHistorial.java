import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// 10. Usar archivos para guardar el historial
// Modificar Historial para que al final del programa, el historial se guarde en un archivo de texto
// llamado historial.txt.

public class GuardarHistorial {

    public static void guardarListaEnArchivo(List<String> lista, String nombreArchivo) {
        try {
            Files.write(Paths.get(nombreArchivo), lista);
            System.out.println("Archivo guardado exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo: " + e.getMessage());
        }
    }
}
