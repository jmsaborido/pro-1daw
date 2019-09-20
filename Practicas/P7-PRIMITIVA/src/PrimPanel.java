import javax.swing.*;
import java.awt.*;


public class PrimPanel extends JPanel {

    private final JLabel t1;
    private JPanel botones;


    public PrimPanel() {
        setLayout(new BorderLayout());
        t1 = new JLabel("Primitiva        ");
        botones= new JPanel();

        botones.setLayout(new GridLayout(2,25));

        add(t1,BorderLayout.WEST);
        add(botones,BorderLayout.EAST);



        setSize(300,300);
    }

    public void anadirBotones(JButton button){
        botones.add(button);



    }


}