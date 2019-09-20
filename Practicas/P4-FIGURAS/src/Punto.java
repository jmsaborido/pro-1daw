import java.util.Objects;

public class Punto implements Comparable<Punto> {
    int x;
    int y;

    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return x == punto.x &&
                y == punto.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public int compareTo(Punto o) {
        return x - o.getX() == 0 ? y - o.getY() : x - o.getX();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
