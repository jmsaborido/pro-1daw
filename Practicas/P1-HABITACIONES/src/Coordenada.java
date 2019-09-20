public class Coordenada {
    private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna(){
        return columna;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", fila,columna);
    }
}
