import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana("Registro", "Acceso a Séneca", "Acceder",
                        "Nombre de usuario", "Contraseña", "Mostrar contraseña",
                        "Acceso con certificado digital", "¿Olvidó su contraseña?", "dni");
            }
        });
    }
}
