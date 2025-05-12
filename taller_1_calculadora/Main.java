
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("Ingrese el primer numero");
        double primerNumero = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double segundoNumero = scanner.nextDouble();

        System.out.println("Seleccione una operacion(+, -, *, /): ");
        char tipoOperacion = scanner.next().charAt(0);

        Operacion op;
        
        switch (tipoOperacion) {
            case '+':
                op = new Suma(primerNumero, segundoNumero);
                break;
            case '-':
                op = new Resta(primerNumero, segundoNumero);
                break;
            case '*':
                op = new Multiplicacion(primerNumero, segundoNumero);
                break;
            case '/':
                op = new Division(primerNumero, segundoNumero);
                break;
            default:
                System.out.println("ERROR! Seleccione una operacion valida (+, -, *, /): ");
                return;
        }

        double resultado = calculadora.ejecutarOperacion(op);
        System.out.println("El resultado de (" + tipoOperacion + ") es: " + resultado);
    }
}