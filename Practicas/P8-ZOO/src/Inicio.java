import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame implements Icuenta {


    private VentanaLogin ventanaLogin;
    private Dialogo dialog;

    public Inicio() {
        super("Login");

        ventanaLogin = new VentanaLogin();

        add(ventanaLogin, BorderLayout.CENTER);
        ventanaLogin.setCountListener(this);
        dialog = new Dialogo(this, 1);


        setPropiedades();
    }

    private void setPropiedades() {
        setBounds(500, 200, 300, 320);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 320));
        pack();
        setVisible(true);
    }

    @Override
    public void formEventOcurred(Usuario e) {
        Database database = new Database();

        if (database.isConnected(e.getUsuario(), e.getPassword())) {
            SwingUtilities.invokeLater(() -> new Marco(database.getConnection()));
            dispose();
        } else {
            dialog.mostrar(true);
        }
    }
}
