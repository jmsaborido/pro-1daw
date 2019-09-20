import java.util.Objects;

public class Casilla {

    private Ficha ficha;

    public Casilla() {

    }

    public void colocar(Ficha ficha) {
        this.ficha = ficha;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public boolean estaVacia() {
        return ficha==null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casilla casilla = (Casilla) o;
        return Objects.equals(ficha, casilla.ficha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ficha);
    }

    @Override
    public String toString() {
        return ficha==null ? "| |" : "|"+ficha+"|";
    }
}
