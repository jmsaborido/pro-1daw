public class Puerta {
    private boolean abierta = false;

    public Puerta(boolean abierta) {
        this.abierta=abierta;

    }

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
         abierta = false;
    }

    public boolean estaAbierta() {
        return abierta;
    }

    @Override
    public String toString() {
        return abierta ? "abierta" : "cerrada";
    }
}
