public class Persona {
    private String nombre;

    public Persona(String nombre) {
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
        assert nombre!=null:"Error:el nombre no puede ser nulo";
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
