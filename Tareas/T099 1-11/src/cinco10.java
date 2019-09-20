public class cinco10 {
    public static int[] generarPares() {
        final int MAX = 50;
        int[] pares = new int[MAX];
        int aux = 0;
        int ran;
        while (aux<pares.length) {
            ran = (int) (50 * Math.random());
            if (ran % 2 == 0)
                pares[aux++] = ran;
        }
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        return pares;
    }


}
