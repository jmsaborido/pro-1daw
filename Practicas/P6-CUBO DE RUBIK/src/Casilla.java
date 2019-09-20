import javax.swing.*;
import java.awt.*;

public class Casilla extends JButton {
    private TipoColor color;
    private JButton button;


    public Casilla(TipoColor color) {
        button = new JButton();
        this.color = color;
        switch (color) {
            case AMARILLO:
                button.setBackground(Color.YELLOW);
                break;
            case AZUL:
                button.setBackground(Color.BLUE);
                break;
            case BLANCO:
                button.setBackground(Color.WHITE);
                break;
            case NARANJA:
                button.setBackground(Color.ORANGE);
                break;
            case ROJO:
                button.setBackground(Color.RED);
                break;
            case VERDE:
                button.setBackground(Color.GREEN);
                break;
            default:
                break;
        }

        button.setOpaque(true);
        button.setEnabled(false);
        button.setSize(400,400);
        button.setVisible(true);

    }

    public JButton getButton() {
        return button;
    }

    @Override
    public String toString() {
        return color.toString();
    }
}
