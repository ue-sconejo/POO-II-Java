
// 2. Implementar la raíz cuadrada
// Crear una clase RaizCuadrada que solo utilice numero1 como entrada (ignorar numero2).
// Hereda de Operacion y retorna la raíz cuadrada de numero1.
public class RaizCuadrada extends Operacion {

    public RaizCuadrada(double numero1, double numero2, String nombreOperacion) {
        super(numero1, numero2, nombreOperacion);
    }

    @Override
    public double Calcular() {
        return Math.sqrt(this.numero1);
    }

    @Override
    public String regisrarHistorial() {
        // Validar que numero1 no sea negativo
        if (this.numero1 >= 0) {
            return "√ " + this.numero1 + " = " + this.Calcular();
        } else {
            return "Error El nuemro ingresado debe de ser positivo!!";
        }
    }
}
