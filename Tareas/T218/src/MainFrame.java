import java.awt.*;

import javax.swing.JFrame;


public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new TextPanel();

        toolbar.setTextPanel(textPanel);

        toolbar.setBg(new color() {
            @Override
            public void textColor(Color bg) {
                toolbar.setBackground(bg);
            }
        });


        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
