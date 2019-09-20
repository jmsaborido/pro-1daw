import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {4, 15, -12, 3, 1, -1};
        int[] b = {4, 15, -12, 3, 1, -1};
        ordenarInsercionDirecta(a);
        System.out.println(Arrays.toString(a));
        ordenarSeleccionDirecta(b);
        System.out.println(Arrays.toString(b));
    }

    public static void ordenarInsercionDirecta(int[] array) {
        int aux, j;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;


        }
    }
    public static void ordenarSeleccionDirecta(int[] array)
    {
        int posmin, aux;
        for (int i = 0; i <array.length-1; i++)
        {
            posmin = i;
            for (int j=i+1; j < array.length; j++)
                if (array[j] < array[posmin])
                    posmin = j;
            aux = array[posmin];
            array[posmin] = array[i];
            array[i] = aux;
        }
    }
}