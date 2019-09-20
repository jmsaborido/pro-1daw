import java.awt.BorderLayout;

import javax.swing.JFrame;


public class MainFrame extends JFrame {


    private Menu menu;
    private TextPanel textPanel;

    public MainFrame() {
        super("Hello World");
        menu= new Menu();
        setJMenuBar(menu);

        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        menu.setTextPanel(textPanel);


        add(textPanel, BorderLayout.CENTER);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }
}
