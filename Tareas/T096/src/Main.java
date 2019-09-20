public class Main {

    public static void main(String[] args) {
        esPrimo(1, 100);
    }

    public static void esPrimo(int desde, int hasta) {
        assert desde<0 : "Error: El numero inicial tiene que ser mayor que 0";
        assert hasta > desde : "Error: El segundo numero tiene que ser mayor que el primero";
        boolean esPrimo;
        for (int i = desde; i < hasta; i++) {
            esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }

            }
            if (esPrimo) {
                String aux =String.valueOf(i);
                aux =aux+", ";
                System.out.print(aux);
            }

        }

    }
}
