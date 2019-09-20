public class Main {

    public static void main(String[] args) {
        try {
            throw new UnException("Excepcion Sin Checkear");
        } catch (UnException e) {
            System.err.println(e.getMessage());
        }

        try {
            throw new CheException("Excepcion Checkeada");
        } catch (CheException e) {
            System.err.println(e.getMessage());
        }
    }

}
