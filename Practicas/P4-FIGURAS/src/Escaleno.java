public class Escaleno extends Triangulo {
    double lado1;
    double lado2;

    public Escaleno(TipoColor color, Punto centro, double base, double altura, double lado1, double lado2) {
        super(color, centro, base, altura);
        this.lado1 = lado1;
        this.lado2 = lado2;
        calcularPerimetro();

    }

    protected void calcularPerimetro() {
        setPerimetro(getBase() + lado1 + lado2);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", base=" + getBase() +
                ", altura=" + getAltura() +
                ", area=" + getArea() +
                ", perimetro=" + getPerimetro() +
                ", color=" + getColor() +
                ", centro=" + getCentro() +
                '}';
    }
}
