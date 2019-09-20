import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private FlowLayout flowLayout;


    private TextPanel textPanel;

    public Toolbar() {
        flowLayout = new FlowLayout();
        setLayout(flowLayout);
        flowLayout.setAlignment(FlowLayout.LEFT);
        flowLayout.setHgap(20);
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");


        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);


        add(helloButton);
        add(goodbyeButton);

    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent clicked = (JComponent) e.getSource();

        if (clicked == helloButton)
            textPanel.appendText("Hello\n");



        else
            textPanel.appendText("Goodbye\n");



    }

}
