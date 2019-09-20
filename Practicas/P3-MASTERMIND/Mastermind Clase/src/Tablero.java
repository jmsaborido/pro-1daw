public class Tablero {
    private CombinacionSecreta secreta;
    private Linea[] lineas;

    public Tablero(CombinacionSecreta secreta,int numIntentos) {
        lineas = new Linea[numIntentos];
        this.secreta = secreta;

    }
}
