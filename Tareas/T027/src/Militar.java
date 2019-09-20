public class Militar {
    private String alias; //No nulo, No vacio

    public Militar(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }
}

