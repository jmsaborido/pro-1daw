public class Main {

    public static void main(String[] args) {
        Tablero a1= new Tablero(12);
        for (int i = 0; i <10 ; i++) {
            a1.colocar(new Robot("Felipe " + (i+1)));

        }
        System.out.println(a1);
    }
}
