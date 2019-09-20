import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> sucesion = new ArrayList<>();

        if (n < 0) { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            sucesion.add(-1);
            return sucesion;
        } else if (n == 0) {  // caso base
            sucesion.add(0);
            return sucesion;
        } else if (n == 1) {
            sucesion.add(1);
            return sucesion;
        } else if (n > 1) {
//            ArrayList<Integer> aux=new ArrayList<>();
            sucesion.add(fibonacci(n-1));
            sucesion.add(9);
            sucesion.add(0);
            return sucesion;
        }
        return sucesion;
    }
}