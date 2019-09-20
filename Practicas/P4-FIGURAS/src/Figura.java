import java.util.Objects;
import java.util.Scanner;

public abstract class Figura implements Comparable<Figura> {
    private TipoColor color;
    private Punto centro;

    public Figura(TipoColor color, Punto centro) {
        this.color = color;
        this.centro = centro;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    protected void mover() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuanto quieres mover la coordenada X");
        centro.setX(centro.getX() + sc.nextInt());
        System.out.println("Dime cuanto quieres mover la coordenada Y");
        centro.setY(centro.getY() + sc.nextInt());


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return color == figura.color &&
                centro.equals(figura.centro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, centro);
    }

    protected void dibujar() {
        System.out.println("Soy un " + getClass().getSimpleName());
    }


    @Override
    public int compareTo(Figura o) {
        return o.color.compareTo(color);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "color=" + color +
                '}';
    }
}
