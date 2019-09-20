import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

    private static Formatter output;


    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    // open file clients.txt
    public static void openFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }

    // add records to file
    public static void addRecords() {
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");
        // loop until end-of-file indicator


        try (Scanner input = new Scanner(System.in)) {
            int i = 2;
            while (i > 0) {
                i--;
                // output new record to file; assumes valid input
                output.format("%s %s %s %s%n", input.next(), input.next(), input.next(), input.next());
                System.out.print("? ");
            }
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file. Terminating.");
            System.exit(1);
        } catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");
        }


    } // end while
    // end method addRecords

    // close file
    public static void closeFile() {
        if (output != null) ;
        output.close();
    }
}

