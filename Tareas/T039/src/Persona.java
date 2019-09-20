public class Persona {
    private static final int MAX = 5;
    private static int contador;
    private String alias;

    public Persona(String alias) {
        assert contador < MAX : "Error:numero maximo de personas alcanzado";
        this.alias = alias;
        ++contador;


    }

    @Override
    public String toString() {
        return alias;
    }
}
