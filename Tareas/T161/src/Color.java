public class Color implements Comparable<Color> {
    private TipoColor color;

    public Color(TipoColor color) {
        this.color = color;
    }

    @Override
    public int compareTo(Color o) {
        return this.color.getLongitud() - o.color.getLongitud();
    }

    @Override
    public String toString() {
        return color.toString();
    }
}
