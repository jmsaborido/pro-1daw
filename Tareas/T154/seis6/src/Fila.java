public class Fila<E extends Persona> {
    private Persona primero;

    public Fila() {
        primero = null;
    }

    public void setPrimero(Persona nuevo) {
        if (estaVacia()) {
            primero = nuevo;
            return;
        }
        Persona aux = primero;
        primero = nuevo;
        nuevo.setAnterior(aux);
    }

    public void agregar(Persona anterior) {
        if (estaVacia()) {
            primero = anterior;
            return;
        }
        Persona aux = primero;
        while (esUltimo(aux))
            aux = aux.getAnterior();
        aux.setAnterior(anterior);
    }

    public void pasarTurno() {
        primero = primero.getAnterior();
    }

    public Persona mostrarPrimero() {
        return primero;
    }

    public void vaciarFila() {
        primero = null;
    }

    public int posicion(Persona indice) {
        Persona aux = primero;
        int cont = 1;
        while (aux != null)
            if (aux.equals(indice))
                return cont;
            else {
                cont++;
                aux = aux.getAnterior();
            }
        return -1;

    }


    public boolean estaVacia() {
        return primero == null;
    }

    public boolean esUltimo(Persona ultimo) {
        return ultimo.getAnterior() != null;
    }

    @Override
    public String toString() {
        if (estaVacia())
            return "";
        String dev = "";
        Persona aux = primero;
        while (esUltimo(aux)) {
            dev = dev + aux + " ";
            aux = aux.getAnterior();
        }
        return dev + aux;
    }
}
