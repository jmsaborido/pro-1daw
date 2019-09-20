import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cubo extends JFrame implements Movedor {
    private Cara[] cubo; //NN,NV,cubo.length=6
    private Cara actual;
    private JButton oeste;
    private JButton este;
    private JButton norte;
    private JButton sur;


    public Cubo() {
        super("P6-CUBO DE RUBIK");


        logicaDeCubo();

        botones();

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        setVisible(true);
        pack();

        clicks();


    }

    private void logicaDeCubo() {
        cubo = new Cara[6];

        Casilla[][] c1 = new Casilla[3][3];
        Casilla[][] c2 = new Casilla[3][3];
        Casilla[][] c3 = new Casilla[3][3];
        Casilla[][] c4 = new Casilla[3][3];
        Casilla[][] c5 = new Casilla[3][3];
        Casilla[][] c6 = new Casilla[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c1[i][j] = new Casilla(TipoColor.values()[0]);
            }
        }
        cubo[0] = new Cara(c1);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c2[i][j] = new Casilla(TipoColor.values()[1]);
            }
        }
        cubo[1] = new Cara(c2);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c3[i][j] = new Casilla(TipoColor.values()[2]);
            }
        }
        cubo[2] = new Cara(c3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c4[i][j] = new Casilla(TipoColor.values()[3]);
            }
        }
        cubo[3] = new Cara(c4);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c5[i][j] = new Casilla(TipoColor.values()[4]);
            }
        }
        cubo[4] = new Cara(c5);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c6[i][j] = new Casilla(TipoColor.values()[5]);
            }
        }
        cubo[5] = new Cara(c6);


        cubo[0].setNorte(cubo[4]);
        cubo[0].setEste(cubo[1]);
        cubo[0].setSur(cubo[5]);
        cubo[0].setOeste(cubo[3]);

        cubo[1].setNorte(cubo[4]);
        cubo[1].setEste(cubo[2]);
        cubo[1].setSur(cubo[5]);
        cubo[1].setOeste(cubo[0]);

        cubo[2].setNorte(cubo[4]);
        cubo[2].setEste(cubo[3]);
        cubo[2].setSur(cubo[5]);
        cubo[2].setOeste(cubo[1]);

        cubo[3].setNorte(cubo[4]);
        cubo[3].setEste(cubo[0]);
        cubo[3].setSur(cubo[5]);
        cubo[3].setOeste(cubo[2]);

        cubo[4].setNorte(cubo[2]);
        cubo[4].setEste(cubo[1]);
        cubo[4].setSur(cubo[0]);
        cubo[4].setOeste(cubo[3]);

        cubo[5].setNorte(cubo[0]);
        cubo[5].setEste(cubo[1]);
        cubo[5].setSur(cubo[2]);
        cubo[5].setOeste(cubo[3]);

        actual = cubo[0];
    }

    private void botones() {
        norte = new JButton("^");
        este = new JButton(">");
        sur = new JButton("v");
        oeste = new JButton("<");
        add(actual, BorderLayout.CENTER);
        add(norte, BorderLayout.NORTH);
        add(este, BorderLayout.EAST);
        add(sur, BorderLayout.SOUTH);
        add(oeste, BorderLayout.WEST);
    }

    private void clicks() {
        norte.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                JButton click =(JButton)e.getSource();

                if (click.equals(norte)) {
                    setSiguiente(norte);
                } else if (click.equals(este)) {
                    setSiguiente(este);

                } else if (click.equals(sur)) {
                    setSiguiente(sur);

                } else if (click.equals(oeste)) {
                    setSiguiente(oeste);

                } else {
                    throw new IllegalArgumentException("Elemento no valido");
                }

            }
        });
        este.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setSiguiente(este);
            }
        });
        sur.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setSiguiente(sur);

            }
        });
        oeste.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setSiguiente(oeste);

            }
        });
    }

    public Cara[] getCubo() {
        return cubo;
    }

    public void setActual(Cara actual) throws NullPointerException {
        if (actual == null)
            throw new NullPointerException("La cara no puede ser nula");
        this.actual = actual;
    }

    public Cara getActual() {
        return actual;
    }

    @Override
    public String toString() {
        return actual.toString();
    }

    @Override
    public void setSiguiente(JButton a) {
        if (a.equals(norte)) {
            remove(actual);
            setActual(actual.getNorte());
        } else if (a.equals(este)) {
            remove(actual);
            setActual(actual.getEste());

        } else if (a.equals(sur)) {
            remove(actual);
            setActual(actual.getSur());

        } else if (a.equals(oeste)) {
            remove(actual);
            setActual(actual.getOeste());

        } else {
            throw new IllegalArgumentException("Elemento no valido");
        }

        add(actual, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
}
