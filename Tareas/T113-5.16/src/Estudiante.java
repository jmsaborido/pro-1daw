public class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        assert nombre != null : "Error:Los nombres no pueden ser nulos";
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}