public class Circulo extends Poligono {
    private int radio;


    public Circulo(TipoColor color, Punto centro, int radio) {
        super(color, centro);
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }

    protected void calcularArea() {
        setArea(Math.PI * Math.pow(radio, 2));
    }

    protected void calcularPerimetro() {
        setPerimetro(2 * Math.PI * radio);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "radio=" + radio +
                ", area=" + getArea() +
                ", perimetro=" + getPerimetro() +
                ", centro=" + getCentro() +
                ", color=" + getColor() +
                '}';
    }
}
