public class Triangulo extends Poligono {
    private double base;
    private double altura;

    public Triangulo(TipoColor color, Punto centro, double base, double altura) {
        super(color, centro);
        this.altura = altura;
        this.base = base;
        calcularArea();
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

    protected void calcularArea() {
        setArea((base * altura) / 2);
    }
}
