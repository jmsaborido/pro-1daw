public class Persona {

    private String nombre;
    private String ape1;
    private String ape2;
    private int peso;
    private double altura;

    public Persona() {

    }

    public void setNombre(String nombre) {
        assert nombre != null : "Error: El nombre no puede ser null";
        assert !nombre.isEmpty() : "Error: el nombre no puede estar vacío";
        assert nombre.length() >= 3 : "Error: La longitud del nombre no puede ser menor de 3";
        this.nombre = nombre;
    }

    public void setApe1(String ape1) {
        assert ape1 != null : "Error: El apellido no puede ser null";
        assert !ape1.isEmpty() : "Error: El apellido no puede estar vacío";
        assert ape1.length() >= 3 : "Error: La longitud del apellido no puede ser menor de 3";
        this.ape1 = ape1;
    }

    public void setApe2(String ape2) {
        assert ape2 != null : "Error: El apellido no puede ser null";
        assert !ape2.isEmpty() : "Error: El apellido no puede estar vacío";
        assert ape2.length() >= 3 : "Error: La longitud del apellido no puede ser menor de 3";

        this.ape2 = ape2;
    }

    public void setPeso(int peso) {
        assert peso >= 0 : String.format("Error: %d no es un peso correcto, tiene que ser mayor o igual a 0",peso);
        this.peso = peso;
    }

    public void setAltura(double altura) {
        assert altura >= 0 : String.format("Error: %d no es una altura correcta, tiene que ser mayor o igual a 0",altura);
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", ape1='" + ape1 + '\'' +
                ", ape2='" + ape2 + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
