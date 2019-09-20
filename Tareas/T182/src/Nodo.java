import java.util.NoSuchElementException;

public class Nodo {
    private Nodo siguiente;
    private int valor;


    public Nodo(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() throws NoSuchElementException{
        if (siguiente==null)
            throw new NoSuchElementException();
        return siguiente;
    }

}
