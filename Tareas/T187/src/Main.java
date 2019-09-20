public class Main {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6};

        try {
            a1[0] = a1[10];
            String a2 = null;
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Hola caracola");
        }
    }
}
