public class Persona implements Comparable<Persona> {
    private int estatura;

    public Persona(int estatura) {
        this.estatura = estatura;
    }

    public int getEstatura() {
        return estatura;
    }


    @Override
    public int compareTo(Persona a) {
        return  estatura - a.getEstatura();
    }

    @Override
    public String toString() {
        return String.valueOf(estatura);
    }
}
