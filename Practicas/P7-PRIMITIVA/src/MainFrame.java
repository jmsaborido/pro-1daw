import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class MainFrame extends JFrame implements ActionListener {

    private PrimPanel primPanel;
    private ReintPanel reintPanel;
    private JButton[] primBut;
    private JButton[] reinBut;
    private int[] resultante;
    private Combinacion combinacion;
    private Loteria l1;
    private JLabel textArea;

    private JLabel c1;
    private JLabel c2;
    private int contador;
    private boolean mostrar;


    public MainFrame() {
        super("Loterias y Apuestas Del Estado");
        mostrar = false;

        resultante = new int[6];

        contador = 0;

        primBut = new JButton[50];
        reinBut = new JButton[10];


        setJMenuBar(barraMenu());

        setLayout(new FlowLayout());

        primPanel = new PrimPanel();
        reintPanel = new ReintPanel();
        textArea = new JLabel();

        c1= new JLabel("");
        c2= new JLabel("");
        add(primPanel, 0);
        add(reintPanel, 1);
        add(textArea, 2);
        add(new JSeparator(),3);
        add(c1,4);
        add(new JSeparator(),5);
        add(c2,6);


        for (int i = 0; i < primBut.length; i++) {
            primBut[i] = new JButton(String.valueOf(i));
            primPanel.anadirBotones(primBut[i]);
            primBut[i].addActionListener(this);
        }

        for (int i = 0; i < reinBut.length; i++) {
            reinBut[i] = new JButton(String.valueOf(i + 1));
            reintPanel.anadirBotones(reinBut[i]);
            reinBut[i].addActionListener(this);
        }

        primPanel.setVisible(mostrar);
        reintPanel.setVisible(mostrar);
        c1.setVisible(false);
        c2.setVisible(false);

        textArea.setSize(500, 100);


        setPreferredSize(new Dimension((int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width ), (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height * 0.4)));
        setSize(new Dimension((int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width ), (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height * 0.4)));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    private JMenuBar barraMenu() {
        JMenuBar menuBar = new JMenuBar();



        JMenu archivo = new JMenu("Archivo");

        JMenuItem guardar = new JMenuItem("Guardar Primitiva...");
        JMenuItem automatica = new JMenuItem("Crear Automaticamente...");
        JMenuItem ganar = new JMenuItem("Gana Automaticamente");
        JMenuItem salir = new JMenuItem("Salir");

        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (combinacion == null) {
                    textArea.setText("Primero tienes que crear la primitiva");
                } else {
                    try(BufferedWriter bw = new BufferedWriter(new FileWriter("Primitiva.txt"))) {
                        bw.write("Su primitiva es: " + combinacion.toString()+ ". Firmado: Don Manuel Ruiz De Lopera, Presidente De Loterias y Apuestas Del Estado ");


                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }


        });

        automatica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                textArea.setText("");
                combinacion = new Combinacion();
                l1 = new Loteria(combinacion);
                textArea.setText(l1.toString());
                c1.setText("Tu primitiva es: "+ l1.getResultado().toString());
                c2.setText("La combinacion ganadora es: " + l1.getGanadora().toString());
                c1.setVisible(true);
                c2.setVisible(true);

            }
        });

        ganar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] a1 = {1, 2, 3, 4, 5, 6};
                combinacion = new Combinacion(a1, 0);
                textArea.setText("");
                l1= new Loteria(combinacion,combinacion);
                textArea.setText(l1.toString());
                c1.setText("Tu primitiva es: "+ l1.getResultado().toString());
                c2.setText("La combinacion ganadora es: " + l1.getGanadora().toString());
                c1.setVisible(true);
                c2.setVisible(true);

            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        menuBar.add(archivo);
        archivo.setMnemonic(KeyEvent.VK_A);
        archivo.add(guardar);
        guardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        archivo.add(automatica);
        automatica.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        archivo.add(ganar);
        ganar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));

        archivo.addSeparator();
        archivo.add(salir);
        salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));



        JMenu editar = new JMenu("Editar");
        menuBar.add(editar);
        JMenu muestraMenu = new JMenu("Mostrar");


        JMenuItem mostrarTodo = new JMenuItem("Seleccionar Manualmente...");
        JMenuItem deshacer = new JMenuItem("Deshacer");
        deshacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));

        editar.add(muestraMenu);
        editar.setMnemonic(KeyEvent.VK_E);
        editar.add(deshacer);
        muestraMenu.add(mostrarTodo);
        mostrarTodo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));


        mostrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar = !mostrar;
                primPanel.setVisible(mostrar);
                reintPanel.setVisible(mostrar);

            }
        });

        deshacer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < primBut.length ; i++) {
                    if (!primBut[i].isEnabled())
                        primBut[i].setEnabled(true);
                }
                for (int i = 0; i <reinBut.length ; i++) {
                    if(!reinBut[i].isEnabled())
                        reinBut[i].setEnabled(true);
                }
                contador=0;
                textArea.setText("");
                c1.setVisible(false);
                c2.setVisible(false);
            }
        });


        return menuBar;


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (contador < 7) {

            for (int i = 0; i < reinBut.length; i++) {
                if (clicked == reinBut[i] && contador == 6) {
                    combinacion = new Combinacion(resultante, Integer.valueOf(reinBut[i].getText()));
                    l1 = new Loteria(combinacion);
                    textArea.setText(l1.toString());
                    reinBut[i].setEnabled(false);
                    c1.setText("Su primitiva es: "+ l1.getResultado().toString());
                    c2.setText("La combinacion ganadora es: " + l1.getGanadora().toString());
                    c1.setVisible(true);
                    c2.setVisible(true);
                    contador++;
                }
            }

            for (JButton button : primBut) {
                if (clicked == (button) && contador < 6) {
                    resultante[contador] = Integer.valueOf(button.getText());
                    button.setEnabled(false);
                    contador++;
                }
            }
        }
    }

}
