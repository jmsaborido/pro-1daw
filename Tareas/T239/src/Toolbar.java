import java.awt.FlowLayout;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;


public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;

    private TextPanel textPanel;

    public Toolbar() {
        helloButton = new JButton("Hello");
        helloButton.setIcon(createIcon("images/eclipse.png"));

        helloButton.addActionListener(this);


        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);



    }

    private ImageIcon createIcon(String path){
        URL url =getClass().getResource(path);

        if (url==null){

            System.err.println("no se ha podido cargar la imagen" + path);
        }
        ImageIcon icon = new ImageIcon(url);
        return icon;


    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent clicked = (JComponent) e.getSource();

        if(clicked instanceof JButton) {
            textPanel.appendText("Eclipse \n");
        }


    }

}
