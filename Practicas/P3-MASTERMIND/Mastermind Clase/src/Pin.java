import java.util.Objects;

public class Pin {
    private  TipoColorPin color;

    public Pin(TipoColorPin color) {
        this.color = color;
    }

    public TipoColorPin getColor() {
        return color;
    }

    public void setColor(TipoColorPin color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pin pin = (Pin) o;
        return color == pin.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return color.toString();
    }
}
