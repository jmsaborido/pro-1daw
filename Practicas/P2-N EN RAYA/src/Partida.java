import java.util.Scanner;

public class Partida {

    public static final int MINDIMENSION = 3;
    public static final int MINFILA = 1;
    public static final int MINCOLUMNA = 1;
    private Jugador[] jugadores;             // NO NULO, <<R>>
    private int turno;                       // [1-2]
    private Tablero tablero;                 // NO NULO , <<R>>
    private boolean tablas;
    private boolean finJuego;
    private Jugador ganador;
    private int dimension;

    public Partida(Jugador j1, Jugador j2, int dimension) {

        setDimension(dimension);
        jugadores = new Jugador[]{j1, j2};
        tablero = new Tablero(this.dimension, this.dimension);
        turno = 1;
        finJuego = false;
        tablas = false;
    }

    public void setDimension(int dimension) {
        assert dimension >= MINDIMENSION :
                "Error: la dimension del tablero tiene que ser mayor o igual que " + MINDIMENSION;
        this.dimension = dimension;
    }

    public void jugar() {

        do {
            Coordenada c;
            boolean correcto;

            System.out.println(tablero);
            System.out.println("Es el turno de: "+jugadorActual() + " con la ficha " + jugadorActual().getFicha().toString() );


            do {
                c = leerCoordenada();
                correcto = tablero.esCoordenada(c);

                if (!correcto)
                    System.out.printf("Coordenada incorrecta: Rango válido (%d-%d) \n", MINFILA, dimension);
                else if(!tablero.estaVacia(c))
                    System.out.printf("La casilla (%d-%d) ya esta ocupada \n", c.getFila()+1, c.getColumna()+1);

            } while (!correcto || !tablero.estaVacia(c));

            tablero.colocar(jugadorActual().getFicha(), c);
            cambiarTurno();


            if (hayGanador(c)) {
                finJuego = true;
                ganador = jugadorActual();
                cambiarTurno();
                System.out.println(tablero);
                System.out.println("Epica Victoria royale. El ganador es: "+ jugadorActual());

            } else if (hayEmpate()){
                tablas = true;
                finJuego = true;
                System.out.println("Empate. Jugad otra a ver si desempatais :)  ");
            }



        } while (!finJuego);
    }

    private boolean hayGanador(Coordenada c) {
        assert c != null : "Error la coordenada no puede ser nulo";

        return tablero.hayDiagonalDerecha() || tablero.hayDiagonalIzquierda() || tablero.hayLineaHorizontal(c.getFila())
                || tablero.hayLineaVertical(c.getColumna());
    }

    private boolean hayEmpate() {

        return tablero.hayTablas();
    }

    private Jugador jugadorActual() {
        return turno == 1 ? jugadores[turno-1] : jugadores[turno-1];
    }

    private void setTurno(int turno) {
        assert turno == 1 || turno == 2 : String.format("Error: el turno (%d) debe ser 1 o 2", turno);
        this.turno = turno;
    }

    private void cambiarTurno() {
        setTurno(turno == 1 ? 2 : 1);
    }

     private Coordenada leerCoordenada() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la fila: ");
        int fila = sc.nextInt();
        System.out.print("Introduzca la columna: ");
        int columna = sc.nextInt();

        return new Coordenada(fila - 1, columna - 1);

    }


}
