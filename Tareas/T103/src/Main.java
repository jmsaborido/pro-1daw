public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        mostrar(a);
        System.out.println();
        rotarDerecha(a,12);
        mostrar(a);
    }

    public static void rotarDerecha(int[] numeros,int n) {
        assert n>=1 :"Error: Tienes que pasar un numero mayor que 0";
        if (numeros.length < 2 || numeros == null)
            return;
        if (n>numeros.length)
            n=n%numeros.length;

        for (int i = 0; i < n; i++) {
            int aux = numeros[numeros.length - 1];
            for (int j = numeros.length - 1; j > 0; j--) {
                numeros[j] = numeros[j - 1];
            }
            numeros[0]=aux;
        }
    }


    public static void mostrar(int[] valores) {
        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? "," : "";
            System.out.print(separador + valores[i]);
        }
    }
}

