import java.util.Calendar;

public class Alumno {
    private String alias;
    private String nombre;
    private String ape1;
    private String ape2;
    private int anioNac;

    public Alumno (){
        alias="";
        nombre="";
        ape1="";
        ape2="";
        anioNac=0;
    }

    // Constructores

    public Alumno(String alias){
        setAlias(alias);
    }

    public Alumno(String alias, int anioNac){
        setAlias(alias);
        setAnioNac(anioNac);
    }

    // Mutadores
    public void setAlias(String alias){
        this.alias=alias;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApe1(String ape1){
        this.ape1=ape1;
    }

    public void setApe2(String ape2){
        this.ape2=ape2;
    }

    public void setAnioNac(int anioNac){
        assert anioNac >= 1900 : "Error: La fecha de nacimiondo no puede ser inferior a 1900("+anioNac+")";
        this.anioNac=anioNac;
    }

    // Otros
    public int edad(){
        Calendar cal= Calendar.getInstance();
        int anioactual=cal.get(Calendar.YEAR);
        return anioactual-anioNac;
    }

    public String nombreCompleto(){
        return nombre+", "+ape1+" "+ape2;
    }

    public String toString(){
        return alias+" con nombre "+nombre+" y apellidos "+ape1+" "+ape2+" y que tiene "+ edad() + " años";
    }

    // Accesores
    public String getAlias(){
        return alias;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApe1(){
        return ape1;
    }

    public String getApe2(){
        return ape2;
    }

    public int getAnioNac(){
        return anioNac;
    }
}

