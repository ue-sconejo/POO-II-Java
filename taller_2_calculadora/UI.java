
import java.util.InputMismatchException;
import java.util.Scanner;


// 9. Separar la lógica de entrada/salida en una clase UI
// Mover la lógica de interacción con el usuario (Scanner, menús) a una nueva clase UI,
// manteniendo el principio de responsabilidad única.

public class UI {

    private Scanner scanner = new Scanner(System.in);
    private Calculadora calculadora = new Calculadora();
    private Historial historial = new Historial();

    public void iniciar() {
        while (menuPregunta()) {
            menu();
        }
        historial.mostrarHistorial();
        historial.guardarEnArchivo();
    }

    private void menu() {
        double primerNumero = solicitarNumero("Ingrese el primer número: ");
        double segundoNumero = solicitarNumero("Ingrese el segundo número: ");

        char tipoOperacion = solicitarOperacion();

        Operacion op = crearOperacion(tipoOperacion, primerNumero, segundoNumero);
        if (op == null) {
            System.out.println("Operación no válida.");
            return;
        }

        String resultado = calculadora.ejecutarOperacion(op);

        historial.addToHistorial(resultado);
        mostrarResultado(resultado);
    }

    private boolean menuPregunta() {
        System.out.println("Desea realizar una operacion? (s,n)");
        char opcion = scanner.next().charAt(0);
        switch (opcion) {
            case 's' -> {
                return true;
            }
            case 'n' -> {
                return false;
            }
            default -> {
                System.out.println("Opcion no valida");
                return false;
            }
        }
    }

    // 8. Validar todas las entradas desde Main
    // En la clase Main, agregar validaciones para evitar que se ingresen valores no numéricos
    // (utiliza manejo de excepciones).

    private double solicitarNumero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("ERROR! Debe ingresar un número.");
                scanner.nextLine();
            }
        }
    }

    private char solicitarOperacion() {
        System.out.print("Seleccione una operación (+, -, *, /, ^, r, %): ");
        return scanner.next().charAt(0);
    }

    private Operacion crearOperacion(char tipo, double num1, double num2) {
        return switch (tipo) {
            case '+' ->
                new Suma(num1, num2, "Suma");
            case '-' ->
                new Resta(num1, num2, "Resta");
            case '*' ->
                new Multiplicacion(num1, num2, "Multiplicación");
            case '/' ->
                new Division(num1, num2, "División");
            case '^' ->
                new Potenciacion(num1, num2, "Potencia");
            case 'r' ->
                new RaizCuadrada(num1, num2, "Raíz Cuadrada");
            case '%' ->
                new Residuo(num1, num2, "Residuo");
            default ->
                null;
        };
    }

    private void mostrarResultado(String resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
