import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (Cerrador a1 = new Cerrador()) {
            a1.setCerrado(true);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
