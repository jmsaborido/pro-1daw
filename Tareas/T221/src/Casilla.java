import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Casilla extends JButton implements ActionListener {
    private TipoColor color;
    private JButton button;


    public Casilla(TipoColor color) {

        button = new JButton();
        setColor(color);
        button.setOpaque(true);
        button.setEnabled(true);
        button.setSize(400, 400);
        button.setVisible(true);
        button.addActionListener(this);

    }

    public void setColor(TipoColor color) {

        switch (color) {
            case ROJO:
                button.setBackground(Color.RED);
                break;
            case VERDE:
                button.setBackground(Color.GREEN);
                break;
            default:
                throw new IllegalArgumentException("Color no valido");
        }
        this.color = color;
    }

    public JButton getButton() {
        return button;
    }


    @Override
    public String toString() {
        return color.toString();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (color.equals(TipoColor.ROJO))
            setColor(TipoColor.VERDE);
        else
            setColor(TipoColor.ROJO);
    }
}