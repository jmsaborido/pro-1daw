public class Nodo<E> {
    private int valor;
    private E  anterior;

    public Nodo(int valor) {
        this.valor = valor;
        anterior=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public E getAnterior() {
        return anterior;
    }

    public void setAnterior(E anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
