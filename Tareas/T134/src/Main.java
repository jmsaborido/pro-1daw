import java.text.Collator;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Character[] a1 = {'a', 'é', 'b', 'e', 'á'};
        Character[] a2 = {'a', 'é', 'b', 'e', 'á'};

        ordenarCollator(a1);
        mostrar(a1);
        System.out.println();
        ordenarCompare(a2);
        mostrar(a2);


    }

    public static void ordenarCompare(Character[] a) {
        int posicion;
        for (int i = 0; i < a.length - 1; i++) {
            posicion = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[posicion]) < 0)
                    posicion = j;
            }

            Character aux = a[posicion];
            a[posicion] = a[i];
            a[i] = aux;


        }
    }


    public static void ordenarCollator(Character[] a) {
        Collator e = Collator.getInstance(new Locale("es", "es"));
        int posicion;
        for (int i = 0; i < a.length - 1; i++) {
            posicion = i;
            for (int j = i + 1; j < a.length; j++) {
                if (e.compare(String.valueOf(a[j]), String.valueOf(a[posicion])) < 0)
                    posicion = j;
            }

            Character aux = a[posicion];
            a[posicion] = a[i];
            a[i] = aux;


        }
    }

    public static void mostrar(Character[] valores) {
        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? "," : "";
            System.out.print(separador + valores[i]);
        }
    }
}


