import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;


public class Toolbar extends JPanel implements ActionListener {
    private JButton seleccionar;
    private JFileChooser file;
    private String nombre;
    private TextPanel textPanel;

    public Toolbar() {
        seleccionar = new JButton("Selecciona el fichero cuyo nombre quieres mostrar por pantalla");
        file = new JFileChooser();

        seleccionar.addActionListener(this);


        setLayout(new FlowLayout());

        add(seleccionar, FlowLayout.LEFT);


    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent clicked = (JComponent) e.getSource();

        if (clicked == seleccionar) {
            file.showDialog(new JDialog(),"Selecciona el fichero");
            nombre=file.getName(file.getSelectedFile());
            System.out.println(nombre);
            textPanel.appendText(nombre);

        }


    }

}
