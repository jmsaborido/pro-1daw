public class Tablero {

    private Casilla[][] casillas;                     // NO NULO <<R>>

    public Tablero(int filas, int columnas) {

        casillas = new Casilla[filas][columnas];
        crearCasillas();
    }

    private void crearCasillas() {

        for (int i = 0; i < casillas.length; i++) {

            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla();
            }
        }
    }

    public void colocar(Ficha f, Coordenada c) {
        assert f != null : "Error: la ficha a colocar no puede ser nulo";
        assert c != null : "Error: la coordenada recibida no puede ser nulo";
        assert esCoordenada(c) : String.format("Error: coordenada (%d-%d) es incorrecta, rango valido(%d-%d)"
                , c.getFila(), c.getColumna(), 1, casillas.length);
        assert estaVacia(c) :
                String.format("Error: la coordena (%d-%d) recibida ya tiene una ficha", c.getFila()+1, c.getColumna()+1);

        casillas[c.getFila()][c.getColumna()].colocar(f);
    }


    public boolean estaVacia(Coordenada c) {
        assert c != null : "Error: la coordenada recibida no puede ser nulo";

        return casillas[c.getFila()][c.getColumna()].estaVacia();
    }

    public boolean esCoordenada(Coordenada c) {
        assert c != null : "Error: la coordenada recibida no puede ser nulo";
        int fila = c.getFila();
        int columna = c.getColumna();
        int finFila = casillas.length;
        int finColumna = casillas[0].length;

        return (fila >= 0 && fila < finFila) && (columna >= 0 && columna < finColumna);
    }


    public boolean hayLineaHorizontal(int fila) {

        int contador = 0;

        for (int i = 0; i < casillas[fila].length - 1; i++) {

            if (casillas[fila][i].estaVacia())
                return false;
            if (casillas[fila][i].getFicha().equals(casillas[fila][i + 1].getFicha()))
                ++contador;

        }

        return contador==casillas[fila].length-1;
    }

    public boolean hayLineaVertical(int columna) {

        int contador = 0;

        for (int i = 0; i < casillas[0].length - 1; i++) {

            if (casillas[i][columna].estaVacia() )
                return false;

            if (casillas[i][columna].getFicha().equals(casillas[i + 1][columna].getFicha()))
                ++contador;


        }
        return contador==casillas[0].length-1;
    }

    public boolean hayDiagonalIzquierda() {

        int contador = 0;

        for (int i = 0; i < casillas.length - 1; i++) {
            if (casillas[i][i].estaVacia())
                return false;
            if (casillas[i][i].getFicha().equals(casillas[i + 1][i + 1].getFicha()))
                ++contador;

        }
        return contador==casillas.length-1;
    }




    public boolean hayDiagonalDerecha() {

        int fin = casillas.length - 1;
        int contador = 0;

        for (int i = 0, j=fin; i <casillas.length-1 ; i++, j--) {

            if (casillas[i][j].estaVacia() )
                return false;

            if (casillas[i][j].getFicha().equals(casillas[i+1][j-1].getFicha()))
                ++contador;
        }

        return contador==fin;
    }

    public boolean hayTablas() {

        for (int i = 0; i <casillas.length ; i++) {

            for (int j = 0; j < casillas[i].length; j++) {

                if (casillas[i][j].estaVacia())
                    return false;

            }
        }
        return true;
    }



    public String toString() {
        String dev =" ";

        for (int i = 0; i <casillas.length+1 ; i++) {
            if(i==0)
                dev +=(" ");
            else {
                dev+=((i));
                dev+=("  ");
            }
        }
        dev+="\n";

        for (int i = 0; i <casillas.length ; i++) {
            for (int j = 0; j <casillas[i].length ; j++) {
                if (j==0)
                    dev+=i+1;
                dev+=casillas[i][j].toString();
            }
            dev+="\n";
        }
        return dev;
    }
}
