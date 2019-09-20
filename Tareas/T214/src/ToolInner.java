import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ToolInner extends JPanel {
    private JButton helloButton;
    private JButton goodbyeButton;

    private TextPanel textPanel;

    public ToolInner() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");


        add(helloButton);
        add(goodbyeButton);


        helloButton.addActionListener(new boton());
        goodbyeButton.addActionListener(new boton());


        setLayout(new FlowLayout(FlowLayout.LEFT));


    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }


    class boton implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            JButton clicked = (JButton) e.getSource();

            if (clicked == helloButton) {
                textPanel.appendText("Hello\n");
            } else if (clicked == goodbyeButton) {
                textPanel.appendText("Goodbye\n");
            }


        }
    }
}