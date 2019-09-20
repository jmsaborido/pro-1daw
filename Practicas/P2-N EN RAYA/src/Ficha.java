import java.util.Objects;

public class Ficha {

    private TipoFicha ficha;              // NO NULO

    public Ficha(TipoFicha ficha) {
        setFicha(ficha);
    }

    public void setFicha(TipoFicha ficha) {
        assert ficha != null : "Error: la ficha recibida no puede ser nulo";
        this.ficha = ficha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ficha ficha1 = (Ficha) o;
        return ficha == ficha1.ficha;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ficha);
    }

    @Override
    public String toString() {
        return  ficha.name();
    }
}
