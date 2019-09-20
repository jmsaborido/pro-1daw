import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;

    private Boolean helloClicked;
    private Boolean byeClicked;

    private TextPanel textPanel;

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");

        helloClicked = false;
        byeClicked = false;


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
        JButton clicked = (JButton) e.getSource();

        if (clicked == helloButton) {
            if (helloClicked) {
                helloButton.setBackground(Color.RED);
                helloClicked = false;

            } else {
                helloButton.setBackground(Color.YELLOW);
                helloClicked = true;
            }
            textPanel.appendText("Hello\n");
        } else if (clicked == goodbyeButton) {
            if (byeClicked) {
                goodbyeButton.setBackground(Color.RED);
                byeClicked=false;
            }else {
            goodbyeButton.setBackground(Color.YELLOW);
            byeClicked=true;
            }
            textPanel.appendText("Goodbye\n");
        }

    }
}
