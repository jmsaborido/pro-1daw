public class cinco11 {
    public static int[] frecuencias(int n) {
        assert n >= 0 : "Error: el numero introducido debe ser mayor que 0";
        final int ITERACIONES = 100;
        n = n + 1;
        int[] frecuencias = new int[n];
        int[] random;
        int contador = 0;
        random = aleatorio(n, ITERACIONES);
        int k = 0;


        for (int i = 0; i < ITERACIONES; i++) {
            for (int j = 0; j < ITERACIONES; j++) {
                if (i == random[j])
                    contador++;
            }
            if (k == n)
                break;
            frecuencias[k] = contador;
            contador = 0;
            k++;

        }


        return frecuencias;
    }

    private static int[] aleatorio(int n, int iteraciones) {
        int[] random = new int[iteraciones];
        for (int i = 0; i < iteraciones; i++) {
            int x = (int) ((Math.random() * (n)));
            random[i] = x;
        }
        return random;
    }

    public static void mostrar(int[] a) {
        if (a == null || a.length == 0)
            return;
        int aux=0;

        for (int i = 0; i < a.length; i++){
            aux+=a[i];
            System.out.println("El numero "+ i + " aparece " + a[i] + " veces");

        }
        System.out.println("Total" + ": "+ aux);
    }


}
