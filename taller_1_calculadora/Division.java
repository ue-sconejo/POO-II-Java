public class Division extends Operacion {

    public Division(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double Calcular() {
        return this.numero1 / this.numero2;
    }
}