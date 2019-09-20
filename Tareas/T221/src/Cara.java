import javax.swing.*;
import java.awt.*;


public class Cara extends JFrame {
    private Casilla[][] cara; //NN,NV cara.length=cara.length[i]=3;


    public Cara() {
        super("T221");
        cara = new Casilla[3][3];
        setCara(cara);
        setLayout(new GridLayout(3, 3));
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        setVisible(true);
        pack();

    }

    public void setCara(Casilla[][] cara) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cara[i][j] = new Casilla(TipoColor.ROJO);
                add(cara[i][j].getButton());
            }
        }
    }


}
