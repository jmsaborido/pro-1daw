import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;


public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;

    private TextPanel textPanel;

    public Toolbar() {
        helloButton = new JButton("Hello");

        helloButton.addActionListener(this);



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


}
