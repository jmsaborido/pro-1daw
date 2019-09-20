import java.util.Objects;

public class Persona<E> {
    private Persona anterior;
    private String alias;

    public Persona(String alias) {
        setAlias(alias);
        anterior=null;
    }

    public Persona getAnterior() {
        return anterior;
    }

    public void setAnterior(Persona anterior) {
        this.anterior = anterior;
    }

    private void setAlias(String alias) {
        assert alias!=null:"Error:el alias no puede ser nulo";
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona<?> persona = (Persona<?>) o;
        return alias.equals(persona.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

    @Override
    public String toString() {
        return alias;
    }
}
