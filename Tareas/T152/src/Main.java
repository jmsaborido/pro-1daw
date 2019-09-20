import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        List palabras = List.of("alava", "álava", "cadiz", "cádiz");

        System.out.println("Lista de palabras:   " + palabras);
        System.out.println(("Ordenación sin clase Collator:   " + ordenarSinCollator(palabras)));
        mostrarf1(palabras);
        mostrarf2(palabras);
        mostrarf3(palabras);
    }

    private static void mostrarf1(List palabras) {
        comprobarList(palabras);

        List ordenacionCollatorF1 = new ArrayList(palabras);

        Collator primaryCollator = Collator.getInstance(new Locale("es", "ES"));

        primaryCollator.setStrength(Collator.PRIMARY);

        //Ordenamos por los niveles de fuerza
        ordenacionCollatorF1.sort(primaryCollator);


        System.out.println("Ordenación con clase Collator (primary):   " + ordenacionCollatorF1);
    }

    private static void mostrarf2(List palabras) {
        comprobarList(palabras);

        List ordenacionCollatorF2 = new ArrayList(palabras);


        Collator secondaryCollator = Collator.getInstance(new Locale("es", "ES"));
        Collator tertiaryCollator = Collator.getInstance(new Locale("es", "ES"));


        secondaryCollator.setStrength(Collator.SECONDARY);
        tertiaryCollator.setStrength(Collator.TERTIARY);

        ordenacionCollatorF2.sort(secondaryCollator);


        System.out.println("Ordenación con clase Collator (secondary): " + ordenacionCollatorF2);
    }

    private static void mostrarf3(List palabras) {
        comprobarList(palabras);

        List ordenacionCollatorF3 = new ArrayList(palabras);

        Collator tertiaryCollator = Collator.getInstance(new Locale("es", "ES"));

        tertiaryCollator.setStrength(Collator.TERTIARY);
        ordenacionCollatorF3.sort(tertiaryCollator);


        System.out.println("Ordenación con clase Collator (tertiary):  " + ordenacionCollatorF3);
    }

    private static List<String> ordenarSinCollator(List palabras) {
        comprobarList(palabras);

        String[] sinCollator = (String[]) palabras.toArray(new String[0]);
        Arrays.sort(sinCollator);

        return Arrays.asList(sinCollator);
    }

    private static void comprobarList(List palabras) {
        assert palabras != null : "Error: la lista palabras no puede ser nula";
        assert palabras.size() > 0 : "Error: la lista palabras no puede ser vacia";
    }
}