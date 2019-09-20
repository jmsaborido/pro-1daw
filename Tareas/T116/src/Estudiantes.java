public class Estudiantes {
    private int altura;

    public Estudiantes(int altura) {
        setAltura(altura);
    }

    public int getAltura() {
        return altura;
    }

    private void setAltura(int altura) {
        this.altura = altura;
    }
    public int compareTo(Estudiantes e){

        return altura-e.altura;
    }

    @Override
    public String toString() {
        return String.valueOf(altura);
    }
}
