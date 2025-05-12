
// 7. Implementar una operación Modulo (residuo)
// Crear una clase Porcentaje que calcule numero1 % numero2.
// Ejemplo: 20 % 5 = 0

public class Residuo extends Operacion {

    public Residuo(double numero1, double numero2, String nombreOperacion) {
        super(numero1, numero2, nombreOperacion);
    }

    //  Polimorfismo
    @Override
    public double Calcular() {
        return this.numero1 % this.numero2;
    }

    @Override
    public String regisrarHistorial() {
        return this.numero1 + " % " + this.numero2 + " = " + this.Calcular();
    }
}
