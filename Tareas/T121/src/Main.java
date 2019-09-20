public class Main {

    public static void main(String[] args) {
        int[][] a1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] a2 = new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        mostrar(a1);
        mostrar(a2);
        System.out.println();
        intercambiarAux(a1, a2);
        mostrar(a1);
        mostrar(a2);
        System.out.println();
        intercambiarXOR(a1, a2);
        mostrar(a1);
        mostrar(a2);
        System.out.println();
    }

    public static void intercambiarAux(int[][] a1, int[][] a2) {
        assert sonIguales(a1, a2) : "Error:los arrays tienen que tener las mismas filas y columnas";
        int[] aux;
        for (int i = 0; i < a1.length; i++) {
            aux = a1[i];
            a1[i] = a2[i];
            a2[i] = aux;


        }
    }

    /**
     * Este metodo intercambia los arrays a y b por el algoritmo XOR
     * coge los valores de los bits de cada entero de cada valor individual
     * de a y b. Por ejemplo:
     * int x, y;
     * x = 1, y = 2; // x=01, y=10
     * x = x ^ y;    // x=11, y=10 en binario, x=3, y=2 en decimal.
     * y = x ^ y;    // x=11, y=01 en binario, x=3, y=1 en decimal
     * x = x ^ y;    // x=10, y=01 en binario, x=2, y=1 en decimal.
     *
     * @param a array
     * @param b array
     */

    private static void intercambiarXOR(int[][] a, int[][] b) {
        assert sonIguales(a, b) : "Error:los arrays tienen que tener las mismas filas y columnas";

        for (int fila = 0; fila < a.length; fila++) {
            for (int columna = 0; columna < a[fila].length; columna++) {
                a[fila][columna] = a[fila][columna] ^ b[fila][columna];
                b[fila][columna] = a[fila][columna] ^ b[fila][columna];
                a[fila][columna] = a[fila][columna] ^ b[fila][columna];
            }

        }
    }

    private static boolean sonIguales(int[][] a1, int[][] a2) {
        assert a1 != null : "Error:el primer array no puede ser nulo";
        assert a2 != null : "Error:el segundo array no puede ser nulo";
        if (a1.length != a2.length)
            return false;
        else
            for (int i = 0; i < a1.length; i++) {
                if (a1[i].length != a2[i].length)
                    return false;

            }
        return true;
    }

    private static void mostrar(int[][] a) {
        assert a != null : "Error:el array no puede ser nulo";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                String separador = (j != 0) ? ", " : "";
                System.out.print(separador + a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}

