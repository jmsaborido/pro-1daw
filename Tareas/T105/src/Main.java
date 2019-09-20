public class Main {

    public static void main(String[] args) {
        char[] vocales = new char[] {'a','e','i','o','u'};
        desplazarIzquierda(vocales,5,'-');
        mostrar(vocales);

    }

    public static void desplazarIzquierda (char[] a1,int n, char sep){
        assert n>=1 :"Error: Tienes que pasar un numero mayor que 0";
        assert a1!=null :"Error: Tienes que pasar un numero mayor que 0";
        if ( a1.length==0)
            return;
        if (n>=a1.length)
            for (int i = 0; i <a1.length ; i++) {
                a1[i]=sep;
            }

        for (int i = 0; i < n; i++) {
            char aux = a1[0];
            for (int j = 0; j < a1.length - 1; j++) {
                a1[j] = a1[j + 1];
            }
            a1[a1.length - 1] = aux;
        }

        for (int i = a1.length-n; i < a1.length; i++) {
            a1[i]=sep;

        }
    }


    public static void mostrar(char[] valores){
        if (valores==null || valores.length==0)
            return;
        for (int i = 0; i <valores.length ; i++) {
            String separador = (i!=0)? ",": "";
            System.out.print(separador+valores[i]);
        }
    }
}
