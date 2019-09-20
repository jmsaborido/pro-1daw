import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JCheckBox goodbyeButton;
    private color bg;

    private TextPanel textPanel;

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JCheckBox("Goodbye");




        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);

    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    public void setBg(color bg) {
        this.bg = bg;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent clicked = (JComponent) e.getSource();

        if(clicked instanceof JButton) {
            textPanel.appendText("Hello\n");
            bg.textColor(Color.RED);
        }
        else if(clicked instanceof JToggleButton) {
            textPanel.appendText("Goodbye\n");
            bg.textColor(Color.BLUE);
        }

    }
}
