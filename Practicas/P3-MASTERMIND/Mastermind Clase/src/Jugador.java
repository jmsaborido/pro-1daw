public class Jugador {
    private String alias;

    public Jugador(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert alias!=null :"Error:El alias no puede ser nulo";
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }
}
