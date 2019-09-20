public class Main {

    public static void main(String[] args) {
        System.out.println(max4(1, 1, 4, -20));
    }


    public static int max4(int a, int b, int c, int d) {
        int aux = 0;
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    aux = a;
                } else {
                    aux = d;
                }
            } else if (c > d) {
                aux = c;
            } else
                aux = d;

        } else {
            if (b > c) {
                if (b > d) {
                    aux = b;
                } else {
                    aux = d;
                }
            } else if (c > d) {
                aux = c;
            } else
                aux = d;
        }
        return aux;

    }
}
