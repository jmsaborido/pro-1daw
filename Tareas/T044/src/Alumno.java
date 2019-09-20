public class Alumno {

    private static final int MINNUMEXP = 10;
    private static int contador;
    private int numExp;
    private String alias;
    // Nombre completo
    private String nombre;
    private String ape1;
    private String ape2;
    private int anioNac;              // >= 1900

    // Constructores
    public Alumno() {

        this.numExp=contador+MINNUMEXP;
        ++contador;
    }

    public Alumno(String alias) {

        this.numExp=contador+MINNUMEXP;
        ++contador;
        setAlias(alias);
    }

    public Alumno(String alias, int anioNac) {

        this.numExp=contador+MINNUMEXP;
        ++contador;
        setAlias(alias);
        setAnioNac(anioNac);
    }

    public String getAlias() {
        return alias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public int getNumExp() {
        return numExp;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }



    public void setAnioNac(int anioNac) {
        assert anioNac >= 1900 : "Error el año de nacimiento tiene que ser mayor o igual a 1900";
        this.anioNac = anioNac;
    }

    public int contarPares(int desde, int hasta) {
        int contador = 0;

        for (int i = desde; i <= hasta ; i++) {
            if ( i%2 == 0)
                ++contador;

        }
        return contador;
    }

    public int edad() {

        return 2018 - anioNac;

    }

    public String nombreCompleto() {
        return getNombre()+" "+ getApe1()+" "+getApe2();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numExp=" + numExp +
                ", alias='" + alias + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ape1='" + ape1 + '\'' +
                ", ape2='" + ape2 + '\'' +
                ", anioNac=" + anioNac +
                '}';
    }
}
