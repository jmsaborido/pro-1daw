package seispunto3;

import java.util.Objects;

public class Nodo {
    private  int numero;
    private  Nodo siguiente;

    public Nodo(int numero){
        this.numero=numero;
        siguiente=null;
    }

    public int getNumero() {
        return numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo nodo = (Nodo) o;
        return numero == nodo.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return Integer.toString(numero);
    }
}
