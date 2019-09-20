public class Main {

    public static void main(String[] args) {
        char[] a = {'1', '3', '5', '7','8','9'};
        char[] b = {'2', '4', '6'};
//        char[] a= new char[0];
//        char[] b= new char[0];

       mostrar(mezclar((mezclar(a, b)),a));
        System.out.println();
       mostrar(a);
    }

    public static char[] mezclar(char[] a1, char[] a2) {
        assert a1!=null && a2!=null :"Error: Los arrays no pueden ser nulos";
        int j = 0;
        char[] r = new char[a1.length + a2.length];
        if (a1.length == 0 && a2.length == 0) {
            System.out.println("ambos arrays tienen tamaño 0");
            return r;
        }
        if (a1.length == 0) {
            r = a2;
            return r;
        }
        if (a2.length == 0) {
            r=a1;
            return a1;
        }

        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                r[j] = a1[i];
                j++;
                r[j] = a2[i];
                j++;
            }
        }
        if (a1.length > a2.length) {
            for (int i = 0; i < a2.length; i++) {
                r[j] = a1[i];
                j++;
                r[j] = a2[i];
                j++;
            }
            for (int i = a2.length; i < a1.length; i++,j++) {
                r[j] = a1[i];
            }
        }
        if (a2.length > a1.length) {
            for (int i = 0; i < a1.length; i++) {
                r[j] = a1[i];
                j++;
                r[j] = a2[i];
                j++;
            }
            for (int i = a1.length; i < a2.length; i++,j++) {
                r[j] = a2[i];
            }
        }


        return r;
    }

    public static void mostrar(char[] valores) {
        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? "," : "";
            System.out.print(separador + valores[i]);
        }
    }
}
