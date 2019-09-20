import java.util.Random;
import java.util.Scanner;

public class Partida {
    private Jugador[] jugadores = new Jugador[2];
    private int turno = 0;
    private Tablero tablero;
    private CombinacionSecreta secreta;
    private static final int MININTENTOS = 10;
    private static final int MAXINTENTOS = 20;
    private int intentos;
    private CombinacionLinea linea;

    public Partida(Jugador[] jugadores, int intentos) {
        setJugadores(jugadores);
        setIntentos(intentos);
    }

    public void setJugadores(Jugador[] jugadores) {
        assert jugadores != null : "Error:los jugadores no pueden ser nulos";
        this.jugadores = jugadores;
    }

    private void generarCombinacionSecreta() {
        Random rgen = new Random();
        TipoColorFicha[] colores = TipoColorFicha.values();
        for (int i = 0; i < colores.length; i++) {
            int randomPosition = rgen.nextInt(colores.length);
            TipoColorFicha temp = colores[i];
            colores[i] = colores[randomPosition];
            colores[randomPosition] = temp;
        }
        setSecreta(new CombinacionSecreta(colores));
    }

    private boolean esFinJuego() {
        if (turno == intentos || secreta.equals(linea))
            return true;
        else
            return false;
    }

    private CombinacionLinea leerCombinacionLinea() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println(" Que color quieres poner en la posicion" + i);
            System.out.println("1=Amarillo");
            System.out.println("2=Azul");
            System.out.println("3=Rojo");
            System.out.println("4=Verde");
            switch (sc.nextInt()) {
                case 1:
                    linea.colocar(new Ficha(TipoColorFicha.AMARILLO), i);
                    break;
                case 2:
                    linea.colocar(new Ficha(TipoColorFicha.AZUL),i);
                    break;
                case 3:
                    linea.colocar(new Ficha(TipoColorFicha.ROJO), i);
                    break;
                case 4:
                    linea.colocar(new Ficha(TipoColorFicha.VERDE), i);
                    break;
                default:
                    System.out.println("Color incorrecto");
                    i--;
                    break;
            }

        }
        return linea;
    }

    public void jugar() {
        generarCombinacionSecreta();

        do {
            System.out.println(jugadores[1] + " Introduce la combinacion de la linea");
            leerCombinacionLinea();
            incrementarIntentos();
            System.out.println(tablero);
        } while (!esFinJuego());
        if (secreta.equals(linea))
            System.out.println(jugadores[1] + " eres el ganador");
        else
            System.out.println(jugadores[2] + " eres el ganador");
    }

    private void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    private void setSecreta(CombinacionSecreta secreta) {
        this.secreta = secreta;
    }

    private void setIntentos(int intentos) {
        assert intentos >= MININTENTOS && intentos <= MAXINTENTOS : "Error: el intentos tiene que ser mayor que 10 y menor que 20";
        this.intentos = intentos;
    }

    private void incrementarIntentos() {
        intentos++;
    }
}
