import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Persona a1 = new Persona(160);
        Persona a2 = new Persona(170);
        Persona a3 = new Persona(180);
        Persona[] a = {a2,a1, a2, a3, a2};
        ordenar(a);
        System.out.println(Arrays.toString(a));

    }

    public static void ordenar(Persona[] a1) {
        assert a1 != null : "Error: el array no puede ser nulo";
        if (a1.length <= 1)
            return;
        int posicion;
        Persona aux;
        for (int i = 0; i < a1.length - 1; i++) {
            posicion = i;
            for (int j = i + 1; j < a1.length; j++)
                if (a1[j].compareTo(a1[posicion]) > 0)
                    posicion = j;


            aux = a1[posicion];
            a1[posicion] = a1[i];
            a1[i] = aux;


        }
    }


}

