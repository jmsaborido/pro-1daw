import java.text.Collator;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String[] a1 = {"aaaaaa","áaaaaa","eaaa", "baaaa", "éaaaa"};
        String[] a2 = {"aaaaaa","áaaaaa","eaaa", "baaaa", "éaaaa"};
        ordenarCollator(a1);
        mostrar(a1);
        System.out.println();
        ordenarCompare(a2);
        mostrar(a2);




    }

    public static void ordenarCompare(String[] a) {
        int posicion;
        for (int i = 0; i < a.length - 1; i++) {
            posicion = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo( a[posicion]) < 0)
                    posicion = j;
            }

            String aux = a[posicion];
            a[posicion] = a[i];
            a[i] = aux;




        }
    }


    public static void ordenarCollator(String[] a) {
        Collator e = Collator.getInstance(new Locale("es", "es"));
        int posicion;
        for (int i = 0; i < a.length - 1; i++) {
            posicion = i;
            for (int j = i + 1; j < a.length; j++) {
                if (e.compare(a[j], a[posicion]) < 0)
                    posicion = j;
            }

                String aux = a[posicion];
                a[posicion] = a[i];
                a[i] = aux;




        }
    }

    public static void mostrar(String[] valores) {
        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? "," : "";
            System.out.print(separador + valores[i]);
        }
    }


}