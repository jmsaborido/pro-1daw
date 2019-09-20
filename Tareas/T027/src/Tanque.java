public class Tanque {
    private Militar conductor;
    private Militar artillero;
    private int filaT;
    private int columnaT;

    public Tanque(Militar conductor, int filaT, int columnaT) {
        this.conductor = conductor;
        this.filaT = filaT;
        this.columnaT = columnaT;
    }

    public Tanque(Militar conductor, Militar artillero, int filaT, int columnaT) {
        this.conductor = conductor;
        this.artillero = artillero;
        this.filaT = filaT;
        this.columnaT = columnaT;
    }
}
