interface CalculoSalario {
    void calcularSalario();
}

interface Registro {
    void registrarEnSistema();
}

class Persona implements Registro {
    protected String nombre;
    protected String email;
    
    @Override
    public void registrarEnSistema() {
        System.out.println("Usuario registrado con credenciales.");
    }
}

class Empleado extends Persona implements CalculoSalario {
    private String cargo;
    
    @Override
    public void calcularSalario() {
        System.out.println("Salario base: $3000");
    }
}

class Proveedor extends Persona {
    private String empresa;
}

class ClienteExterno extends Persona {
    private String sector;
}

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Empleado();
        Persona p2 = new Proveedor();
        Persona p3 = new ClienteExterno();
        
        if (p1 instanceof Empleado) {
            ((Empleado) p1).calcularSalario();
        }
        
    }
}