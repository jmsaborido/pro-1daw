public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(ordenado(a));
    }

    public static boolean ordenado(int[] a) {
        assert a != null : "Error: El array es nulo";
        if (a.length <= 1)
            return true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return false;
            }
        return true;
    }
}
