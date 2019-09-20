public class Robot {
    private String nombre;

    public Robot(String nombre) {
        assert nombre!=null:"Error: el nombre no puede ser nulo";
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
