
import javax.swing.*;


public class TextPanel extends JTabbedPane {

    private JTextArea textArea;

    public TextPanel() {
        textArea = new JTextArea();


        addTab("Pestaña",new JScrollPane(textArea));
    }

    public void appendText(String text) {
        textArea.append(text);

    }
}