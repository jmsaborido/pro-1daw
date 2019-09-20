import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


public class MainFrame extends JFrame implements WindowListener {

    private TextPanel textPanel;
    private Toolbar tollInner;

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());
        addWindowListener(this);

        tollInner = new Toolbar();
        textPanel = new TextPanel();

        tollInner.setTextPanel(textPanel);

        add(tollInner, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setSize(600, 500);
        setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("la ventana se ha abierto");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("la ventana se esta cerrando");

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("la ventana se ha cerrrado");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // este no funciona bien, creo que deberia de haber una segunda ventana y que se cerrase mediante codigo, no mediante
        // una iteraccion del usuario
        // System.out.println("la ventana se ha minimizado");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("la ventana se ha vuelto a abrir");
        ;

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("La ventana esta en primer plano");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("La ventana esta en segundo plano");


    }
}
