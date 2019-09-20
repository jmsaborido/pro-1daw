import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaLogin extends JPanel implements ActionListener {

    private static final Color COLOR_TEXTO = Color.decode("#706D9F");

    private JTextField usuarioTexto;
    private JPasswordField passwordText;
    private JButton entrar;
    private Icuenta usuarioLectura;
    private JCheckBox mostrarClave;



    public VentanaLogin() {

        setLayout(new BorderLayout());

        add(panelDatos("Acceder", "Nombre De Usuario", "Contraseña", "Mostrar Contraseña"), BorderLayout.CENTER);
        add(panelAyuda("¿Has olvidado tu contraseña?", "¿No te has registrado aun?"),BorderLayout.SOUTH);

    }



    private JPanel panelDatos(String textoBoton, final String texto, String etiquetaTextoClave, String textoCheckbox) {
        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.Y_AXIS));


        JLabel etiquetaUsuario = new JLabel(texto);
        etiquetaUsuario.setForeground(COLOR_TEXTO);
        etiquetaUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
        etiquetaUsuario.setPreferredSize(new Dimension(200, 20));

        usuarioTexto = new JTextField(10);
        usuarioTexto.setPreferredSize(new Dimension(300, 20));
        usuarioTexto.setMaximumSize(new Dimension(590, 20));

        JLabel etiquetaClave = new JLabel(etiquetaTextoClave);
        etiquetaClave.setForeground(COLOR_TEXTO);
        etiquetaClave.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
        etiquetaClave.setPreferredSize(new Dimension(200, 20));

        passwordText = new JPasswordField();
        passwordText.setPreferredSize(new Dimension(300, 20));
        passwordText.setMaximumSize(new Dimension(590, 20));

        mostrarClave = new JCheckBox(textoCheckbox);
        mostrarClave.setForeground(COLOR_TEXTO);
        mostrarClave.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        mostrarClave.setPreferredSize(new Dimension(200, 20));
        mostrarClave.addActionListener(this);

        panelCentral.add(etiquetaUsuario);
        panelCentral.add(usuarioTexto);
        panelCentral.add(etiquetaClave);
        panelCentral.add(passwordText);
        panelCentral.add(mostrarClave);

        panelSuperior.add(panelCentral, BorderLayout.NORTH);

        JPanel pnlBoton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        entrar = new JButton(textoBoton);
        pnlBoton.add(entrar);
        entrar.addActionListener(this);


        panelSuperior.add(pnlBoton, BorderLayout.CENTER);

        return panelSuperior;
    }

    private JPanel panelAyuda(String textoEnlace1, String textoEnlace2) {
        JPanel panelSuperior = new JPanel(new BorderLayout());
        JPanel panelInterior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lIcono = new JLabel();
        panelInterior.add(lIcono);

        JLabel enlace1 = new JLabel(textoEnlace1);
        enlace1.setFont(new Font("Serif", Font.PLAIN, 10));
        panelInterior.add(enlace1);

        JPanel panelInferior = new JPanel();
        JLabel enlace2 = new JLabel(textoEnlace2);
        enlace2.setFont(new Font("Serif", Font.PLAIN, 10));

        panelInferior.add(enlace2);

        panelSuperior.add(panelInterior, BorderLayout.NORTH);
        panelSuperior.add(panelInferior, BorderLayout.CENTER);
        return panelSuperior;
    }

    public void setCountListener(Icuenta usuarioLectura) {
        this.usuarioLectura = usuarioLectura;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AbstractButton clicked = (AbstractButton) e.getSource();

        if (clicked == entrar) {
            String usuario = usuarioTexto.getText();
            String password = String.valueOf(passwordText.getPassword());

            Usuario ev = new Usuario(this, usuario, password);

            if (usuarioLectura != null) {
                usuarioLectura.formEventOcurred(ev);
            }
        } else if (clicked == mostrarClave) {
            if (mostrarClave.isSelected()) {
                passwordText.setEchoChar((char) 0);
            } else
                passwordText.setEchoChar('*');
        }
    }

}



