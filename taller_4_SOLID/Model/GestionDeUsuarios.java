package Model;

import Model.*;
import Interface.*;

import java.util.ArrayList;
import java.util.List;

public class GestionDeUsuarios {

    private List<String> usuarios;
    private ValidadorEmail validador;
    private AlmacenamientoArchivo almacenamiento;
    private EnvioCorreo servicioCorreo;

    public GestionDeUsuarios() {
        this.usuarios = new ArrayList<>();
        this.validador = new ValidadorEmail();
        this.almacenamiento = new AlmacenamientoArchivo();
        this.servicioCorreo = new EnvioCorreo();
    }

    public void agregarUsuario(String usuario) {
        if (validador.esValido(usuario)) {
            usuarios.add(usuario);
            System.out.println("Usuario agregado: " + usuario);
            almacenamiento.guardar(usuario);
        } else {
            System.out.println("Correo inválido!!: " + usuario);
        }
    }

    public void enviarCorreoBienvenida(String correo) {
        if (validador.esValido(correo)) {
            servicioCorreo.enviarBienvenida(correo);
        }
    }

    public void generarReporte(Reporte reporte) {
        reporte.generar();
    }
}