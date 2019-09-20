import javax.swing.*;
import java.awt.*;

public class PanelTexto extends JPanel {
    JTextArea areaTexto;


    public PanelTexto() {

        setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        areaTexto.setBackground(Color.yellow);

        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
    }

    public void append(String text) {
        areaTexto.append(text);
    }

}

