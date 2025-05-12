package Model;

import Interface.ValidadorUsuario;

public class ValidadorEmail implements ValidadorUsuario {
    public boolean esValido(String usuario) {
        return usuario.contains("@");
    }
}