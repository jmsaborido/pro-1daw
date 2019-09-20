import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1
        System.out.println(div(1,0));
        // 2
        try {
            terminal();
        }catch (InputMismatchException e){
            System.out.println("Eso no es un entero, pichón.");
        }
        // 3
        // llamar();
        // 4
        // mostrar(null);
        // // 5
        // try {
        //     new ObjetoUnico();
        //     // new ObjetoUnico();
        // }catch (IllegalStateException e){
        //     System.out.println("El objeto es único, pichón");
        // }

    }

    public static int div(int a, int b) throws IllegalArgumentException {
        if (b == 50)
            throw new IllegalArgumentException("pichón");
        int dev = 0;
        try {
            dev = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Estas intentando dividir entre 0, pichón");
        }
        return dev;
    }

    public static void terminal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un entero");
        int j = sc.nextInt();
        System.out.println(Math.pow(j, j));
    }

    public static void llamar() {
        try {
            div(1, 50);
        } catch (IllegalArgumentException e) {
            System.out.println("Me has pasado 50 pichón");
        }
    }

    public static void mostrar(String x) {
        try {
            System.out.println(x);
        } catch (NullPointerException e) {
            System.out.println("Me has pasado un nulo, pichón ");
        }
    }
}
