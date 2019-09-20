import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


// IntelliJ nos dice que NoSuchElementException y InputMismatchException son identicas debido
// debido a que la primera es superclase de la segunda. Deberiamos usar las dos para diferencias esi es un problema
// de una excepcion u otra, aunque podriamos poner solo 2  catchg

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un entero");
        try {
            sc.nextInt();
        }catch (NoSuchElementException e){
            e.getMessage();
//        }catch (InputMismatchException e){
//            e.getMessage();
        }catch (IllegalStateException e ){
            e.getMessage();
        }
    }
}
