import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {2, 3, -5, 4, 0};
        ordenarSeleccionDirecta(a);
        System.out.println(Arrays.toString(a));
    }

    public static void ordenarSeleccionDirecta(int[] array) {
        assert array != null : "Error: el array no puede ser nulo";
        if (array.length <= 1)
            return;
        int posmin;
        for (int i = 0; i < array.length; i++) {
            posmin = posicionDelMinimo(array, i+1);
            intercambiar(array, posmin, i);
        }

    }


    private static int posicionDelMinimo(int[] array, int i) {
        assert array != null : "Error: el array no puede ser nulo";

        int posmin = i;
        for (int j = i ; j < array.length; j++) {
            if (array[j] < array[posmin])
                posmin = j;
        }
        return posmin;


    }

    private static void intercambiar(int[] array, int posmin, int i) {
        assert array != null : "Error: el array no puede ser nulo";

        int aux = array[posmin];
        array[posmin] = array[i];
        array[i] = aux;

    }
}
