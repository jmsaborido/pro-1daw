import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private MainFrame mainFrame;

    private TextPanel textPanel;

    public Toolbar(MainFrame mainFrame, String hola) {
        this.mainFrame=mainFrame;
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
        JButton clicked = (JButton)e.getSource();

        if(clicked == helloButton) {
            Dialogo dialogo= new Dialogo();
            dialogo.setModal(true);
            dialogo.setSize(500,500);

        }
        else if(clicked == goodbyeButton) {
            textPanel.appendText("Goodbye\n");
        }

    }


}
