import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
    }

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("Contabilidad"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }finally {
            System.out.println("Escaner inicializado correctamente");
        }
    }

    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");
        try {
            while (input.hasNext()) {
//                Preguntar error
//                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
//                        input.next(), input.next(), input.nextDouble());
                System.out.printf("%-10s%-12s%-12s%10s%n", input.next(),
                        input.next(), input.next(), input.next());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        } catch (NullPointerException e) {
            System.err.println("Error no se ha inicializado el Scanner");
        } finally {
            closeFile();
        }
    }

    public static void closeFile() {
        if (input != null)
            input.close();
    }
}