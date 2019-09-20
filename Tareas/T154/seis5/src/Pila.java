import java.util.EmptyStackException;

public class Pila<E extends Nodo <E>> {
    private Nodo <E> cima;

    public Pila() {
        cima=null;

    }
    public void apilar(Nodo<E> nuevo) {
        if (estaVacia()){
            cima = nuevo;
            return;
        }
        Nodo aux = cima;
        cima=nuevo;
        nuevo.setAnterior((E) aux);


    }

    public void sacar(){
        cima= cima.getAnterior();

    }
    public boolean estaVacia(){
        return cima==null;
    }
    public Nodo <E> devolverCima(){
        if (estaVacia()){
            throw new EmptyStackException();
        }
        return cima;
    }

    @Override
    public String toString() {
        if (estaVacia())
            return "";

        String ret="";
        Nodo aux =cima;
        while (aux.getAnterior()!=null){
            ret=ret+ aux + " ";
            aux= (Nodo) aux.getAnterior();

        }
        return ret + (aux);

    }
}
