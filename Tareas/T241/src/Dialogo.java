import javax.swing.*;
import java.awt.*;

public class Dialogo extends JDialog {
    private JLabel label;

    public Dialogo(Frame owner, String title) {
        super(owner, title);
        setModal(true);
        setLayout(new FlowLayout());
        setBounds(500, 500, 275, 100);
        setResizable(false);
        setVisible(false);

        label = new JLabel("Usuario ó Contraseña incorrecto");
        label.setForeground(Color.red);

        add(new JSeparator(),0);
        add(label,1 );
    }
}
