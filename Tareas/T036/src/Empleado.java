public class Empleado {
    private static int contador = 0;
    private int id;
    private String nombre;


    public Empleado(String nombre) {
        setNombre(nombre);
        id= ++contador;
    }

    public void setNombre(String nombre) {
        assert nombre != null : "Error el nombre no puede ser null";
        assert !nombre.isEmpty() : "Error: el nombre no puede estar vacio";
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return id +" "+ nombre;
    }
}
