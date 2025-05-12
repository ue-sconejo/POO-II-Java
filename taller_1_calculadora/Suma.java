//  Herencia
public class Suma extends Operacion {

    public Suma(double numero1, double numero2) {
        super(numero1, numero2);
    }

    //  Polimorfismo
    @Override
    public double Calcular() {
        return this.numero1 + this.numero2;
    }
}