public class Main {

    public static void main(String[] args) {
        String b = "Eclipse";

        try {
            b.charAt(99);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("SUPERCLASE");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("SUBCLASE");
        }
    }
}
