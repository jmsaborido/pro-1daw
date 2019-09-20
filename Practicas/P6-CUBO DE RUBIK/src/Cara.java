import javax.swing.*;
import java.awt.*;

public class Cara extends JPanel {
    private Casilla[][] cara; //NN,NV cara.length=cara.length[i]=3;
    private Cara[] adjuntas; //NN,NV, adjuntas[0]=Norte,adjuntas[1]=Este,adjuntas[3]=Sur,adjuntas[1]=Oeste


    public Cara(Casilla[][] cara) {
        adjuntas=new Cara[4];
        setCara(cara);
        setLayout(new GridLayout(3,3));
        actualGrid();

    }

    public void setCara(Casilla[][] cara) throws IllegalArgumentException {
        if (cara.length != 3)
            throw new IllegalArgumentException("Las caras tienen que tener 3 columnas");
        for (int i = 0; i < cara.length; i++)
            if (cara[i].length != 3)
                throw new IllegalArgumentException("La fila " + (i + 1) + " no tiene 3 casillas");
        this.cara = cara;
    }

    public void setAdjuntas(Cara[] adjuntas) throws IllegalArgumentException, NullPointerException {

        for (int i = 0; i < adjuntas.length; i++) {
            if (adjuntas[i] == null)
                throw new NullPointerException("Las caras adjuntas no pueden ser nulas");
            for (int j = i + 1; j < adjuntas.length - 1; j++) {
                if (adjuntas[i] == adjuntas[j])
                    throw new IllegalArgumentException("Las caras no pueden ser iguales");
            }
        }
        this.adjuntas = adjuntas;

    }

    public void setNorte(Cara norte) throws IllegalArgumentException {
        if (adjuntas != null)
            for (int i = 0; i < adjuntas.length; i++) {
                if (norte == adjuntas[i])
                    throw new NullPointerException("La cara que quieres poner ya esta puesta en la posicion " + i);
            }
        adjuntas[0] = norte;
    }

    public void setEste(Cara este) throws IllegalArgumentException {
        for (int i = 0; i < adjuntas.length; i++) {
            if (este == adjuntas[i] && adjuntas[i] != null)
                throw new NullPointerException("La cara que quieres poner ya esta puesta en la posicion " + i);
        }
        adjuntas[1] = este;
    }

    public void setSur(Cara sur) throws IllegalArgumentException {
        for (int i = 0; i < adjuntas.length; i++) {
            if (sur == adjuntas[i] && adjuntas[i] != null)
                throw new NullPointerException("La cara que quieres poner ya esta puesta en la posicion " + i);
        }
        adjuntas[2] = sur;
    }

    public void setOeste(Cara Oeste) throws IllegalArgumentException {
        for (int i = 0; i < adjuntas.length; i++) {
            if (Oeste == adjuntas[i] && adjuntas[i] != null)
                throw new NullPointerException("La cara que quieres poner ya esta puesta en la posicion " + i);
        }
        adjuntas[3] = Oeste;
    }

    public Cara getNorte() throws NullPointerException {
        if (adjuntas == null)
            throw new NullPointerException("Tienes que adjuntar las caras norte sur este y oeste");
        return adjuntas[0];
    }

    public Cara getEste() throws NullPointerException {
        if (adjuntas == null)
            throw new NullPointerException("Tienes que adjuntar las caras norte sur este y oeste");
        return adjuntas[1];
    }

    public Cara getSur() throws NullPointerException {
        if (adjuntas == null)
            throw new NullPointerException("Tienes que adjuntar las caras norte sur este y oeste");
        return adjuntas[2];
    }

    public Cara getOeste() throws NullPointerException {
        if (adjuntas == null)
            throw new NullPointerException("Tienes que adjuntar las caras norte sur este y oeste");
        return adjuntas[3];
    }

    private void actualGrid() {
        for (int i = 0; i < cara.length; i++) {
            for (int j = 0; j < cara[i].length; j++) {
                add(cara[i][j].getButton());

            }

        }
    }



    public Casilla[][] getCara() {
        return cara;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < cara.length; i++) {
            for (int j = 0; j < cara[i].length; j++) {
                result += cara[i][j].toString();
                result += (j == 2) ? "" : " ";
            }
            result += "\n";
        }
        return result;
    }
}
