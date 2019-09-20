public class Jugador {
    private static int turno = -1;
    private int jugadores =4;

    public Jugador() {
        ++turno;
        jugadores++;
//        setTurno(turno%2);

        setTurno(turno%jugadores);

    }

    private void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "turno=" + turno +
                '}';
    }
}
