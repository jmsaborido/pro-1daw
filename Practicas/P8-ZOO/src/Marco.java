import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.SQLException;

import static javax.swing.SwingUtilities.updateComponentTreeUI;

public class Marco extends JFrame {


    private static Dialogo dialog;
    private static Connection connection;
    private PanelBase select;


    public Marco(Connection connection) {
        super("Tabla de animales");
        this.connection = connection;


        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        UIManager.put("Menu.border", BorderFactory.createLineBorder(Color.WHITE, 0));
        UIManager.put("MenuBar.border", BorderFactory.createLineBorder(Color.WHITE, 0));

        SwingUtilities.updateComponentTreeUI(this);
        updateComponentTreeUI(this);


        setLayout(new BorderLayout());
        select = new PanelBase(connection);
        add(select, BorderLayout.SOUTH);
        dialog = new Dialogo(this, 2);
        dialog.setVisible(false);


        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setPreferredSize(new Dimension(500, 700));
        pack();
        setVisible(true);
        addWindowListener(new WindowListener() {

            @Override
            public void windowClosing(WindowEvent e) {
                select.cerrar();
                dispose();

            }


            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }


        });
    }

    public static void mostrar(String usuario, String operacion) {
        try {
            dialog.setUsuario(connection.getMetaData().getUserName());
        } catch (SQLException e) {
            dialog.setUsuario(" No hay usuario, esto ha fallao basto ");
        }
        dialog.setOperacion(operacion);
        dialog.mostrar(true);

    }
}
