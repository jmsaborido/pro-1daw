import java.util.concurrent.ThreadLocalRandom;

public class Tablero {
    private int filas;
    private int columnas;
    private int filaT;
    private int columnaT;
    private final int minfilas = 3;
    private final int mincolumnas = 3;
    private final int maxfilas = 6;
    private final int maxcolumnas = 5;

    public Tablero(int filas, int columnas) {
        setFilas(filas);
        setColumnas(columnas);
      //  System.out.println(filas);
        //System.out.println(columnas);
        setFilaT();
        setColumnaT();
        esCoordenada(filaT, columnaT);
        System.out.println(filaT);
        System.out.println(columnaT);
        Militar juan = new Militar("juan");
        Militar pedro = new Militar("pedro");
        Tanque a1 = new Tanque(juan, pedro, filaT, columnaT);


    }

    private int setFilas(int filas) {
        this.filas = filas;
        assert (filas >= minfilas) && (filas <= maxfilas) : String.format("Error dilas: has introducido %d y los valores tienen que estar entre %d y %d", filas, minfilas, maxfilas);
        return filas;
    }

    private int setColumnas(int columnas) {
        this.columnas = columnas;
        assert (columnas >= mincolumnas) && (columnas <= maxcolumnas) : String.format("Error columnas: has introducido %d y los valores tienen que estar entre %d y %d", columnas, mincolumnas, maxcolumnas);
        return columnas;
    }

    private int setFilaT() {
        filaT = ThreadLocalRandom.current().nextInt(minfilas, filas + 1);
        return filaT;
    }

    private int setColumnaT() {
        columnaT = ThreadLocalRandom.current().nextInt(mincolumnas, columnas + 1);
        return columnaT;
    }

    private void esCoordenada(int filaT, int columnaT) {
        assert (filaT >= minfilas) && (filaT <= filas) : String.format("Error filaT: has introducido %d y los valores tienen que estar entre %d y %d", filaT, minfilas, filas);
        assert (columnaT >= mincolumnas) && (columnaT <= columnas) : String.format("Error columnaT: has introducido %d y los valores tienen que estar entre %d y %d", columnaT, mincolumnas, columnas);
    }
    //private int
}
