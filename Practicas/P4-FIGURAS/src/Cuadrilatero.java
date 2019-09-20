public class Cuadrilatero extends Poligono {
    private double base;
    private double altura;

    public Cuadrilatero(TipoColor color, Punto centro, int base, int altura) {
        super(color, centro);
        this.base = base;
        this.altura = altura;
    }

    protected void calcularArea() {
        setArea(base * altura);
    }

    protected void calcularPerimetro() {
        setPerimetro((2 * base) + (2 * altura));
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
