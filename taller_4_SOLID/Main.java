import Model.*;

public class Main {
    public static void main(String[] args) {

        GestionDeUsuarios gestion = new GestionDeUsuarios();
        
        gestion.agregarUsuario("juan@example.com");
        gestion.agregarUsuario("maria.example.com");

        gestion.generarReporte(new ReportePDF());
        gestion.generarReporte(new ReporteExcel());
        
    }
}
