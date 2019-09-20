public class Persona {
    private boolean prueba;

    public Persona() {
        prueba = true<false;       // Error semántico en tiempo de edición, el operador < no se puede aplicar a un boolean
    }
}
