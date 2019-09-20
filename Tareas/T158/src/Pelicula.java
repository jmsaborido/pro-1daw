import java.util.LinkedList;

public class Pelicula {
    private String alias;
    private LinkedList<String> reparto ;

    public Pelicula(String alias,LinkedList<String> reparto) {
        this.alias=alias;
        this.reparto = reparto;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public LinkedList<String> getReparto() {
        return reparto;
    }

    public void añadir (String a1){
        assert a1!=null:"Error: la cadena no puede ser nula";
        reparto.add(a1);

    }

    @Override
    public String toString() {
        return alias;
    }
}
