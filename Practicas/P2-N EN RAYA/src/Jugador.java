public class Jugador {

    private String alias;                               // NO NULO, NO VACIO, NO MODIFICABLE
    private Ficha ficha;                                // NO NULO


    public Jugador(String alias, Ficha ficha) {
        setAlias(alias);
        setFicha(ficha);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias recibido no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias no puede estar vacio";
        this.alias = alias;
    }

    public void setFicha(Ficha ficha) {
        assert ficha != null : "Error: la ficha recibida no puede ser nulo";
        this.ficha = ficha;
    }

    public Ficha getFicha() {
        return ficha;
    }

    @Override
    public String toString() {
        return alias;
    }
}
