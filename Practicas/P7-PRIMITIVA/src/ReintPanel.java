import javax.swing.*;
import java.awt.*;

public class ReintPanel extends JPanel {


    private final JLabel t1;
    private final JPanel botones;

    public ReintPanel() {
        setLayout(new BorderLayout());
        t1 = new JLabel("Reintegro        ");
        botones = new JPanel();


        botones.setLayout(new GridLayout(2, 5));

        botones.setSize(300,300);
        add(t1,BorderLayout.WEST);

        add(botones,BorderLayout.EAST);


        setSize(300, 300);
    }
    public void anadirBotones(JButton button){
        botones.add(button);



    }

}
