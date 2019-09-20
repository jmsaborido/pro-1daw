import java.util.Arrays;

public class Linea {
    private static final int TAMAÑO = 4;
    private Ficha[] linea = new Ficha[TAMAÑO];   //No nulo
    private Ficha[] pines = new Ficha[TAMAÑO];   //No nulo

    public Linea(Ficha[] linea, Ficha[] pines) {
        this.linea = linea;
        this.pines = pines;
    }
    private boolean estaVacio(){
        return true;
    }

    @Override
    public String toString() {
        return  Arrays.toString(linea) +
                 Arrays.toString(pines);
    }
}
