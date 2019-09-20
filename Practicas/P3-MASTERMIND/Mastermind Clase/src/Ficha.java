import java.util.Objects;

public class Ficha {
    private TipoColorFicha color;

    public Ficha(TipoColorFicha color) {
        setColor(color);
    }

    public TipoColorFicha getColor() {
        return color;
    }

    private void setColor(TipoColorFicha color) {
        this.color = color;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ficha ficha = (Ficha) o;
        return color == ficha.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return String.valueOf(color);
    }
}
