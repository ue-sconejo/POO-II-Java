package Model;

import Interface.Almacenamiento;

public class AlmacenamientoArchivo implements Almacenamiento {
    public void guardar(String usuario) {
        System.out.println("Guardando en archivo: " + usuario);
    }
}