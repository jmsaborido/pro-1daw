import java.util.Objects;

public class Nodo<E> {
    private String alias;
    private int altura;

    public Nodo(String alias, int altura) {
        setAlias(alias);
        setAltura(altura);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo nodo = (Nodo) o;
        return alias == nodo.alias;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

    @Override
    public String toString() {
        return (alias)+" "+ altura;
    }

    public int compareTo(Nodo o) {
        return alias.compareTo(o.alias)==0? altura-o.altura:alias.compareTo(o.alias)  ;
    }
}
