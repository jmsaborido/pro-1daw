import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //En la api de java
        //NoSuchElementException - if no such tokens are available
        // IllegalStateException - if this scanner is closed
        Scanner sc= new Scanner(System.in);
        sc.next();

        try {
            sc.next();
        }catch (NoSuchElementException |IllegalStateException e ){
            System.err.println(e.getMessage());
        }
    }
}
