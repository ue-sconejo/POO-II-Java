public class Division extends Operacion {

    public Division(double numero1, double numero2, String nombreOperacion) {
        super(numero1, numero2, nombreOperacion);
    }

    @Override
    public double Calcular() {
        return this.numero1 / this.numero2;
    }
    
    @Override
    public String regisrarHistorial() {
        return this.numero1 + " / " +this.numero2 + " = " + this.Calcular();
    }
}