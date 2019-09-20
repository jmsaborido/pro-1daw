import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame {
    private static final Color COLOR_TEXTO = Color.decode("#706D9F");
    private JLabel etiquetaTitulo;
    private JTextField campoNombreUsuario;
    private JPasswordField campoClaveUsuario;
    private JButton botonAceptar;

    public Ventana(String tituloVentana, String titulo, String textoBoton, String etiquetaUsuario,
                   String etquetaClave, String textoCheck, String info1, String info2, String icono)
            throws HeadlessException {
        super(tituloVentana);
        add(panelTitulo(titulo), BorderLayout.NORTH);
        add(panelDatos(textoBoton, etiquetaUsuario, etquetaClave, textoCheck), BorderLayout.CENTER);
        add(panelAyuda(info1, info2, icono),BorderLayout.SOUTH);
        setPropiedades();
    }

    public JTextField getCampoNombreUsuario() {
        return campoNombreUsuario;
    }

    public JPasswordField getCampoClaveUsuario() {
        return campoClaveUsuario;
    }

    private void setPropiedades() {
        setBounds(500, 200, 300, 320);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 320));
        pack();
        setVisible(true);
    }

    private JPanel panelTitulo(String titulo) {
        JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel icono = new JLabel();
        icono.setIcon(new ImageIcon(getClass().getResource("/imagenes/candado.png")));
        icono.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 0));
        pnlTitulo.add(icono);

        etiquetaTitulo = new JLabel(titulo);
        etiquetaTitulo.setBorder(BorderFactory.createEmptyBorder(10, 5, 0, 0));
        etiquetaTitulo.setFont(new Font("Serif", Font.BOLD, 14));
        etiquetaTitulo.setForeground(COLOR_TEXTO);
        pnlTitulo.add(etiquetaTitulo);

        return pnlTitulo;
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

        campoNombreUsuario = new JTextField(10);
        campoNombreUsuario.setPreferredSize(new Dimension(300, 20));
        campoNombreUsuario.setMaximumSize(new Dimension(590, 20));

        JLabel etiquetaClave = new JLabel(etiquetaTextoClave);
        etiquetaClave.setForeground(COLOR_TEXTO);
        etiquetaClave.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
        etiquetaClave.setPreferredSize(new Dimension(200, 20));

        campoClaveUsuario = new JPasswordField();
        campoClaveUsuario.setPreferredSize(new Dimension(300, 20));
        campoClaveUsuario.setMaximumSize(new Dimension(590, 20));

        final JCheckBox mostrarClave = new JCheckBox(textoCheckbox);
        mostrarClave.setForeground(COLOR_TEXTO);
        mostrarClave.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        mostrarClave.setPreferredSize(new Dimension(200, 20));
        mostrarClave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(mostrarClave.isSelected())
                campoClaveUsuario.setEchoChar((char) 0);
            else
                campoClaveUsuario.setEchoChar('*');
            }
        });

        panelCentral.add(etiquetaUsuario);
        panelCentral.add(campoNombreUsuario);
        panelCentral.add(etiquetaClave);
        panelCentral.add(campoClaveUsuario);
        panelCentral.add(mostrarClave);

        panelSuperior.add(panelCentral, BorderLayout.NORTH);

        JPanel pnlBoton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botonAceptar = new JButton(textoBoton);
        pnlBoton.add(botonAceptar);


        panelSuperior.add(pnlBoton, BorderLayout.CENTER);

        return panelSuperior;
    }

    private JPanel panelAyuda(String textoEnlace1, String textoEnlace2, String icono) {
        JPanel panelSuperior = new JPanel(new BorderLayout());
        JPanel panelInterior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lIcono = new JLabel();
        lIcono.setIcon(new ImageIcon(getClass().getResource("/imagenes/" + icono + ".png")));
        panelInterior.add(lIcono);

        JLabel enlace1 = new JLabel(textoEnlace1);
        enlace1.setFont(new Font("Serif", Font.PLAIN, 10));
        panelInterior.add(enlace1);

        JPanel panelInferior = new JPanel();
        JLabel enlace2 = new JLabel(textoEnlace1);
        enlace2.setFont(new Font("Serif", Font.PLAIN, 10));

        panelInferior.add(enlace2);

        panelSuperior.add(panelInterior, BorderLayout.NORTH);
        panelSuperior.add(panelInferior, BorderLayout.CENTER);
        return panelSuperior;
    }

}
