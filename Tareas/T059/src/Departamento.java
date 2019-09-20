public class Departamento {
    private static int contador;
    private int num;
    private String nombre;
    private char letra;


    public Departamento(String nombre, char letra) {
        setLetra(letra);
        setNombre(nombre);
        setNum(++contador);

    }

    public void setNum(int num) {
        assert num >= 0 : "Error: El numero tine que ser mayor o igual a 0";
        this.num = num;
    }

    public void setNombre(String nombre) {
        assert nombre != null : "Error: el nombre no puede ser nulo";
        assert !nombre.isEmpty() : "Error el nombre no puede estar vacío";
        this.nombre = nombre;
    }

    public void setLetra(char letra) {
        assert nombre != null : "Error: el nombre no puede ser nulo";
        this.letra = letra;
    }



    @Override
    public String toString() {
        return "Departamento{" +
                "num=" + num +
                ", nombre='" + nombre + '\'' +
                ", letra=" + letra +
                '}';
    }
}

