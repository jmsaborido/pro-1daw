public class Persona {
    private String alias;
    private char sexo;
    private Persona padre;
    private Persona madre;
    private Persona conyuge;
    private Persona amigo;


    public Persona(String alias, char sexo) {
        setAlias(alias);
        setSexo(sexo);

    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setPadre(Persona padre) {
        assert sexo == 'V' : "Error: El padre tiene que ser Varon";
        assert !(padre.equals(this)) : "Error: una persona no puede ser padre de si mismo";
        this.madre = madre;

    }

    public void setMadre(Persona madre) {
        assert sexo == 'F' : "Error: El padre tiene que ser Varon";
        assert !(madre.equals(this)) : "Error: una persona no puede ser madre de si mismo";
        this.madre = madre;

    }

    public void setSexo(char sexo) {
        assert sexo == 'V' || sexo == 'F' : "Error:El sexo solo puede ser V ó F";
        this.sexo = sexo;

    }

    public Persona getConyuge() {
        if (!this.estaCasada())
            System.out.println("Esta persona no esta casada");
        return this.conyuge;
    }

    public boolean estaCasada() {
        if (conyuge != null)
            return true;
        else
            return false;
    }

    public void setConyuge(Persona conyuge) {
        assert this.sexo != conyuge.sexo : "Error: Los conyuges tienen que tener sexos opuestos";
        assert !(this.equals(conyuge)) : "Error: Una persona no puede ser conyuge de si misma";
        this.conyuge = conyuge;
        conyuge.conyuge=this.conyuge;

    }

    public void setAmigo(Persona amigo) {
        this.amigo = amigo;
    }


}
