import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;


public class Toolbar extends JPanel implements  MouseListener, MouseWheelListener{
    private JButton helloButton;

    private TextPanel textPanel;

    public Toolbar() {
        helloButton = new JButton("Hello");

        helloButton.addMouseListener(this);

        helloButton.addMouseWheelListener(this
        );

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);



    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        textPanel.appendText("He clickado el boton\n");
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        textPanel.appendText("Estoy moviendo el scroll del raton\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        textPanel.appendText("Presionado\n");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        textPanel.appendText("He soltado el boton del ranton\n");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        textPanel.appendText("He entrado en el boton\n");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        textPanel.appendText("He salido del boton\n");


    }


}
