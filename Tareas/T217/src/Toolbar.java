import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;


public class Toolbar extends JPanel implements ActionListener, MouseListener, MouseWheelListener {
    private JButton helloButton;

    private TextPanel textPanel;

    public Toolbar() {
        helloButton = new JButton("Hello");

        helloButton.addActionListener(this);

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
    public void actionPerformed(ActionEvent e) {
        JComponent clicked = (JComponent) e.getSource();

        if(clicked instanceof JButton) {
            textPanel.appendText("Hello\n");
        }


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        textPanel.appendText("Clicked\n");
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        textPanel.appendText("Mooved\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
