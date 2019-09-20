import javax.swing.*;
import java.awt.*;

public class Dialogo extends JDialog {

    public Dialogo() {

        setTitle("Progreso");
        add(new ProgressBarDemo());
        setSize(500,500);
        setModalityType(ModalityType.APPLICATION_MODAL);
        setVisible(true);
        setPreferredSize(new Dimension(500,500));
        pack();

    }
}
