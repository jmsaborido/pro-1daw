public class Main {

    public static void main(String[] args) {
        Pila a1=new Pila();
        for (int i = 0; i <10 ; i++) {
            a1.apilar(new Nodo(i));
        }
        System.out.println(a1);
        a1.sacar();
        System.out.println(a1);
    }
}
