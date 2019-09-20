public class Cuadrado extends Cuadrilatero {
    public Cuadrado(TipoColor color, Punto centro, int lado) {
        super(color, centro, lado, lado);
        calcularPerimetro();
        calcularArea();
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "lado=" + getBase() +
                ", area=" + getBase() +
                ", perimetro=" + getAltura() +
                ", centro=" + getCentro() +
                ", color=" + getColor() +
                '}';
    }
}
