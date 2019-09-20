import java.util.Objects;

public class Ficha {
    private TipoFicha ficha;  // No Nulo, No Modificable

    public Ficha(TipoFicha ficha) {
        setFicha(ficha);
    }

    public TipoFicha getFicha() {
        return ficha;
    }

    private void setFicha(TipoFicha ficha) {
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
        return String.valueOf(ficha);
    }
}
