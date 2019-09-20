import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton holaBoton;
    private JButton adiosBoton;
    private PanelTexto panelTexto;


    public Toolbar() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        try {
            holaBoton.addActionListener(this);


        } catch (NullPointerException e) {
            System.err.println(e.getClass());
            holaBoton = new JButton("Hola");
            adiosBoton = new JButton("Adios");
            setLayout(new FlowLayout(FlowLayout.LEFT));


            holaBoton.addActionListener(this);
            adiosBoton.addActionListener(this);

            add(holaBoton);
            add(adiosBoton);
        }
    }

    public void setPanelTexto(PanelTexto panelTexto) {
        this.panelTexto = panelTexto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pulsar = (JButton) e.getSource();

        if (pulsar == holaBoton) {
            panelTexto.append("Hola\n");
        } else if (pulsar == adiosBoton) {
            panelTexto.append(("Adios\n"));
        }
    }
}