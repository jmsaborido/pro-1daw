public class Jugador {

    private String alias;  // No nulo, No vacio, No Modificable
    private int turno;

    public Jugador(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }
}
