package seispunto3;

public class ListaSE {
    private Nodo inicio;
    private int longitud;

    public ListaSE() {
        inicio = null;
        setLongitud(0);
    }

    public void setLongitud(int longitud) {
        assert longitud <= 0 : "Error:la longitud tiene que ser positiva";
        this.longitud = longitud;
    }

    public void agregar(Nodo nuevo) {

        if (inicio == null) {
            inicio = nuevo;
            return;
        }

        Nodo aux = inicio;
        while (aux.getSiguiente() != null)
            aux = aux.getSiguiente();
        aux.setSiguiente(nuevo);
        setLongitud(getLongitud());

    }

    public void insertar(Nodo nuevo) {
        if (inicio == null) {
            inicio = nuevo;
        }
        Nodo aux = inicio;
        inicio = nuevo;
        nuevo.setSiguiente(aux);
        setLongitud(getLongitud());
    }

    public boolean insertarAntes(Nodo antiguo, Nodo nuevo) {
        boolean devolver = false;
        if (inicio == null)
            return devolver;

        if (inicio.equals(antiguo)) {
            insertar(nuevo);
            devolver = true;
        }


        Nodo aux = inicio;
        Nodo ant;

        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().equals(antiguo)) {
                devolver = true;
                ant = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                aux = aux.getSiguiente();
                aux.setSiguiente(ant);

            }
            aux = aux.getSiguiente();

        }
        setLongitud(getLongitud());
        return devolver;
    }

    public boolean insertarDespues(Nodo antiguo, Nodo nuevo) {
        {
            boolean devolver = false;
            if (inicio == null)
                return devolver;


            Nodo aux = inicio;
            Nodo ant;

            while (aux.getSiguiente() != null) {
                if (aux.equals(antiguo)) {
                    devolver = true;
                    ant = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    aux = aux.getSiguiente();
                    aux.setSiguiente(ant);

                }
                aux = aux.getSiguiente();

            }
            setLongitud(getLongitud());
            return devolver;
        }
    }

    public boolean buscar(Nodo nodo) {
        if (inicio == null)
            return false;
        Nodo aux = inicio;
        do {
            if (nodo.equals(aux))
                return true;
            else
                aux = aux.getSiguiente();

        } while (aux.getSiguiente() == null);
        return false;

    }

    public int contar(Nodo nodo) {

        if (inicio == null)
            return 0;
        Nodo aux = inicio;
        int cont = 0;

        while (aux.getSiguiente() != null) {
            if (nodo.equals(aux))
                cont++;
            aux = aux.getSiguiente();

        }
        return cont;

    }

    public boolean borrar(Nodo borrar) {
        if (inicio == null)
            return false;
        boolean devolver = false;
        Nodo aux = inicio;

        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().equals(borrar)) {
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                devolver = true;
            }
            aux = aux.getSiguiente();
        }
        longitud--;
        return devolver;
    }

    public int getLongitud() {
        if (inicio==null){
            setLongitud(0);
            return 0;
        }

        Nodo aux = inicio;
        int contador = 1;
        while (aux.getSiguiente() != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        setLongitud( contador);
        return longitud;
    }

    public void borrar() {
        inicio = null;
        setLongitud(0);
    }

    public ListaSE filtrar(Nodo nodo) {
        int contador = this.contar(nodo);
        if (contador == 0)
            return new ListaSE();
        else {
            ListaSE retorno = new ListaSE();
            retorno.inicio = nodo;
            for (int i = 1; i < contador; i++) {
                retorno.agregar(nodo);

            }
            System.out.println(retorno);
            return new ListaSE();
        }
    }

    public int getPosicion(int posicion) {
        int retorno = 0;
        Nodo aux = inicio;
        while (aux.getSiguiente() != null) {
            if (retorno == posicion)
                return aux.getNumero();
            aux = aux.getSiguiente();
            retorno++;


        }
        return -1;


    }


    @Override
    public String toString() {
        if (inicio == null) {
            return "";
        }
        Nodo aux = inicio;
        String texto = "";
        while (aux.getSiguiente() != null) {
            texto = texto + aux + " ";
            aux = aux.getSiguiente();
        }
        return texto + aux;
    }
}
