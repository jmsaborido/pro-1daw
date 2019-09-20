package seispunto3;

public class Main {

    public static void main(String[] args) {
        ListaSE a1 = new ListaSE();
        for (int i = 0; i < 10; i++) {
            a1.agregar(new Nodo(i));
        }
        a1.insertar(new Nodo(2));
        System.out.println(a1);
        a1.insertarAntes(new Nodo(0), new Nodo(20));
        System.out.println(a1);
        a1.insertarDespues(new Nodo(4),new Nodo(50));
        System.out.println(a1);
        System.out.println(a1.contar(new Nodo(2)));
        a1.borrar(new Nodo(20));
        System.out.println(a1);
        System.out.println(a1.getLongitud());


    }
}