public class Rectangulo extends Cuadrilatero {
    public Rectangulo(TipoColor color, Punto centro, int base, int altura) {
        super(color, centro, base, altura);
        calcularArea();
        calcularPerimetro();
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "base=" + getBase() +
                ", altura=" + getAltura() +
                ", area=" + getArea() +
                ", perimetro=" + getPerimetro() +
                ", centro=" + getCentro() +
                ", color=" + getColor() +
                '}';
    }
}
