import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private PanelTexto textPanel;
    private Toolbar toolbar;

    public MainFrame() {
        super("Que pasa");

        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new PanelTexto();

        toolbar.setPanelTexto(textPanel);


         try {
             add(toolbar, GridBagConstraints.BASELINE_TRAILING);
         }catch (IllegalArgumentException e){
             System.err.println(e.getClass());
         }



        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
