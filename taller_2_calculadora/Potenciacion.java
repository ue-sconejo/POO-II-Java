
// 1. Agregar una nueva operación: Potenciación
// Implementar una clase Potenciacion que herede de Operacion y sobreescriba el método
// calcular para retornar numero1 elevado a numero2.

public class Potenciacion extends Operacion {

    public Potenciacion(double numero1, double numero2, String nombreOperacion) {
        super(numero1, numero2, nombreOperacion);
    }

    @Override
    public double Calcular() {
        return Math.pow(this.numero1, this.numero2);
    }

    @Override
    public String regisrarHistorial() {
        return this.numero1 + " ^ " + this.numero2 + " = " + this.Calcular();
    }
}
