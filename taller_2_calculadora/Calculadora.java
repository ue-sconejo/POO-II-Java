
// 4. Mostrar el nombre de la operación junto con el resultado
// Modificar la clase Calculadora para que el método ejecutarOperacion() imprima también el
// nombre de la operación ejecutada.

public class Calculadora {
    public String ejecutarOperacion(Operacion operacion){
        return "[" + operacion.getNombreOperacion() + "] " + operacion.regisrarHistorial();
    }
}