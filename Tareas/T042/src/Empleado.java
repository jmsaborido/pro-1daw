public class Empleado {

    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo) {
       setNombre(nombre);
       setCargo(cargo);
    }

    public Empleado(String nombre) {
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

   /* @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj instanceof Empleado){
            Empleado empleado = (Empleado) obj;
            return this.cargo.equals(empleado.cargo);
           // return this.cargo.equals(empleado.cargo) && this.nombre.equals(empleado.nombre);
        }

        else
            return false;

    }*/

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
