import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {
        abrir();
    }

    public static void abrir() {
        try {
            input = new Scanner(Paths.get("clients.txt"));
        } catch (IOException e) {
            if (e instanceof NoSuchFileException)
                System.err.println("Fichero no encontrado");
            else
                System.err.println("Error opening file. Terminating.");

            System.exit(1);
        }
    }
}