import java.util.ArrayList;
import java.util.List;

// 6. Agregar una clase Historial
// Crear una clase Historial que guarde en una lista (List<String>) los resultados de todas las
// operaciones ejecutadas. Mostrar el historial al final del programa.

public class Historial {

    private List<String> historial;
    
    public Historial(){
        historial = new ArrayList<>();
    }

    public void addToHistorial(String resultado) {
        this.historial.add(resultado);
    }

    public void mostrarHistorial(){
        System.out.println("--- Historial ---");
        for (String resultado : historial) {
            System.out.println(resultado);
        }
    }

    public void guardarEnArchivo() {
        GuardarHistorial guardar = new GuardarHistorial();
        guardar.guardarListaEnArchivo(this.historial,"historial.txt");
    }
}
