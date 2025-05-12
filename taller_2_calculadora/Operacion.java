
// 3. Modificar la clase Operacion para aceptar un nombre de operación
// Agregar un atributo String nombreOperacion a la clase Operacion, y proporcionar un método
// getNombreOperacion() para identificar la operación.

public abstract class Operacion implements Registrable {

    protected double numero1;
    protected double numero2;
    protected String nombreOperacion;

    public Operacion(double numero1, double numero2, String nombreOperacion) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.nombreOperacion = nombreOperacion;
    }

    public abstract double Calcular();

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    @Override
    public abstract String regisrarHistorial();
}
