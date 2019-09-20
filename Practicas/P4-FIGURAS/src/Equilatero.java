public class Equilatero extends Triangulo {
    public Equilatero(TipoColor color, Punto centro, double base, double altura) {
        super(color, centro, base, altura);
        calcularPerimetro();
    }

    protected void calcularPerimetro() {
        setPerimetro(getBase() * 3);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "base=" + getBase() +
                ", altura=" + getAltura() +
                ", area=" + getArea() +
                ", perimetro=" + getPerimetro() +
                ", color=" + getColor() +
                ", centro=" + getCentro() +
                '}';
    }
}
