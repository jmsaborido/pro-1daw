import javax.swing.*;
import java.awt.*;

public class Dialogo extends JDialog {
    private int aux;
    private JLabel label;
    private String usuario;
    private String operacion;


    public Dialogo(Frame owner, int aux) {
        super(owner, "Error");
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
        setModal(true);
        setLayout(new FlowLayout());
        setBounds(500, 500, 275, 100);
        setResizable(false);
        setVisible(false);


        add(new JSeparator(), 0);

        this.aux = aux;
    }

    public void texto(int aux) {
        switch (aux) {
            case 1:
                label = new JLabel("Usuario ó Contraseña incorrecto");
                break;
            case 2:
                if (label == null)
                    label = new JLabel("El usuario " + usuario + " no tiene permiso para " + operacion +" elementos en la base de datos");
                else
                    label.setText("El usuario " + usuario + " no tiene permiso para " + operacion+" elementos en la base de datos");
                setSize(700, 100);
                break;
            default:
                label = new JLabel("Algo has hecho mal socio");
                break;
        }
        label.setForeground(Color.red);
        add(label, 1);
    }

    public void mostrar(Boolean b) {
        texto(aux);
        setVisible(b);


    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
