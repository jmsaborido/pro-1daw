public abstract class Poligono extends Cerrada {
    private double area;
    private double perimetro;

    public Poligono(TipoColor color, Punto centro) {
        super(color, centro);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    protected void calcularPerimetro() {
    }


    protected void calcularArea() {
    }
}
