package Model;

import Interface.Reporte;

public class ReportePDF implements Reporte {
    public void generar() {
        System.out.println("Generando reporte en PDF");
    }
}