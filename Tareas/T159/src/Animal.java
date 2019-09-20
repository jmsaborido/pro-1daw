public class Animal implements Comparable<Animal>{
    private String especie;
    private String alias;

    public Animal(String especie, String alias) {
        this.especie = especie;
        this.alias = alias;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias +" "+ especie;
    }

    @Override
    public int compareTo(Animal o) {
        return this.alias.compareTo(o.alias);
    }
}
