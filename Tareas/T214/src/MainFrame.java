
import java.awt.BorderLayout;

import javax.swing.JFrame;


public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private ToolInner tollInner;

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());

        tollInner = new ToolInner();
        textPanel = new TextPanel();

        tollInner.setTextPanel(textPanel);

        add(tollInner, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
