import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile {

    private static ObjectOutputStream output; // outputs data to file



    // open file clients.ser
    public static void openFile() {
        try {
            output = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("clients.ser")));

        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program

        }

    }

    // add records to file


    public static void addRecords()
    {


        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");

        // loop until end-of-file indicator

        try (Scanner input = new Scanner(System.in)) {
            while (input.hasNext()) {


                // create new record; this example assumes valid input
                Account record = new Account(input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
                output.writeObject(record);
                System.out.println("?");
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");

        } catch (IOException ioException) {
            System.err.println("Error writing to file. Terminating.");

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }


    // close file and terminate application
    public static void closeFile() {
        try {
            if (output != null)
                output.close();

        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");

        }

    }

} // end class CreateSequentialFile

