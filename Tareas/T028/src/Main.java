public class Main {
    public static void main(String[] args) {
        potencia(5, 2);

    }

    public static void potencia(int a, int b) {
        int c = (int) (Math.pow(a, b));
        System.out.println(c);
    }
}