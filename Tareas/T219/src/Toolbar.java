import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private boolean adios = false;

    private TextPanel textPanel;

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");


        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);


        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);

    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent clicked = (JComponent) e.getSource();

        if (clicked == helloButton) {
            textPanel.appendText("Hello\n");
            adios = !adios;
            if (adios) {
                goodbyeButton.setActionCommand("Adios");
            } else {
                goodbyeButton.setActionCommand("Hola");
            }
        } else if (goodbyeButton.getActionCommand().equals("Adios")) {
            textPanel.appendText("Goodbye\n");
        }

    }
}


