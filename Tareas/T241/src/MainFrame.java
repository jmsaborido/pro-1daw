import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

public class MainFrame extends JFrame implements Icuenta {

    private JTable table;
    private VentanaLogin ventanaLogin;
    private Dialogo dialog;

    public MainFrame() {
        super("Login");

        ventanaLogin = new VentanaLogin();
        table= new JTable();

        add(table,BorderLayout.CENTER);
        table.addColumn(new TableColumn(1));
        add(ventanaLogin, BorderLayout.EAST);
        ventanaLogin.setCountListener(this);


        dialog = new Dialogo(this, "Herror");

        setPropiedades();
    }

    private void setPropiedades() {
        setBounds(500, 200, 300, 320);
//        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 320));
        pack();
        setVisible(true);
    }

    @Override
    public void formEventOcurred(Usuario e) {
        if (!e.getPassword().matches("^[A-Za-z]{1,8}$") || !e.getUsuario().matches("^[a-zA-Z]{1,6}")) {
            dialog.setVisible(true);
        }
    }

}
