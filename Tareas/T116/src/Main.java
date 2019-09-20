public class Main {

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 2, 1, 0};
        int n = 11;
        Estudiantes[] b = new Estudiantes[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = new Estudiantes(i);
        }
        b[n] = new Estudiantes(5);
        ordenacionBurbuja(a);
        System.out.println(mostrar(a));
        ordenacionBurbuja(b);
        System.out.println(mostrar(b));
    }

    public static void ordenacionBurbuja(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int temp;
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public static void ordenacionBurbuja(Estudiantes[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            Estudiantes temp;
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public static String mostrar(int[] valores) {
        String aux = "";

        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? ", " : "";
            aux += separador + valores[i];
        }
        return aux;

    }

    public static String mostrar(Estudiantes[] valores) {
        String aux = "";

        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? ", " : "";
            aux += separador + valores[i];
        }
        return aux;

    }
}
