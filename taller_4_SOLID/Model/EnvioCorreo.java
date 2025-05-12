package Model;

import Interface.ServicioCorreo;

public class EnvioCorreo implements ServicioCorreo {
    public void enviarBienvenida(String correo) {
        System.out.println("Enviando correo de bienvenida a: " + correo);
    }
}