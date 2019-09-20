

public class Militar implements Comparable<Militar> {
    private String alias;
    private TipoRango rango;
    private int peso;

    public Militar(String alias, TipoRango rango, int peso) {
        setAlias(alias);
        setRango(rango);
        setPeso(peso);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        assert alias != null : "Error: el alias no puede ser nulo";
        assert alias.length() > 0 : "Error: el alias no puede ser vacio";
        this.alias = alias;
    }

    public TipoRango getRango() {
        return rango;
    }

    public void setRango(TipoRango rango) {
        assert rango!=null : "Error: el alias no puede ser nulo";
        this.rango = rango;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean equals(Militar otro) {
        assert otro!=null : "Error: el militar no puede ser nulo";
        assert otro.getRango()!=null : "Error: el militar debe tener un rango asignado";
        if (this == otro) return true;
        return this.rango == otro.rango;
    }

    public int compareTo(Militar otro){
        assert otro!=null : "Error: el militar no puede ser nulo";
        assert otro.getRango()!=null : "Error: el militar debe tener un rango asignado";

        return rango.compareTo(otro.rango)==0?alias.compareTo(otro.alias):rango.compareTo(otro.rango);
    }



}