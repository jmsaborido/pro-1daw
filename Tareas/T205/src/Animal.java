import java.io.Serializable;

public class Animal implements Comparable<Animal>, Serializable {
    private String alias;
    private int peso;

    public Animal(String alias, int peso) {
       setAlias(alias);
        setPeso(peso);
    }

    public String getAlias() {
        return alias;
    }

    public int getPeso() {
        return peso;
    }

    private void setAlias(String alias) {
        this.alias = alias;
    }

    private void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Animal o) {
        return this.peso-o.getPeso();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "alias='" + alias + '\'' +
                ", peso=" + peso +
                '}';
    }
}
