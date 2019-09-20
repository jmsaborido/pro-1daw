public class Main {

    public static void main(String[] args) {
        tripas(100);
    }


    public static void tripas(int r) {
        int bin, p, q, x;
        bin = 1;
        q = 0;
        while (q < r) {
            for (p = 40 - 3 * q; p > 0; --p)
                System.out.print(" ");
            for (x = 0; x <= q; ++x) {
                if ((x == 0) || (q == 0))
                    bin = 1;
                else
                    bin = (bin * (q - x + 1)) / x;
                System.out.print("      ");
                System.out.print(bin);
            }

            System.out.println();
            ++q;
        }
    }
}


