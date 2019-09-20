public class Main {

    public static void main(String[] args) {
        double[] a = {1, 2, 3, 5, 7};
        int[] b = {1, 1, 3, 1, 5};
//        System.out.println(cinco3.dias(32));
        /*5.4*/
//      int[] cinco4 = {1, 2, 3, 5, 7};
//      mostrar(cinco4);
//        System.out.println(cinco3.dias(2,2004));

//        cinco9.rotarDerecha(b);
//        mostrar(b);
//        cinco11.mostrar(cinco11.frecuencias(15));
        cinco11.mostrar(cinco11.frecuencias(20));

    }

    public static void mostrar (int []valores){
        if (valores==null || valores.length==0)
            return;
        for (int i = 0; i <valores.length ; i++) {
            String separador = (i!=0)? ",": "";
            System.out.print(separador+valores[i]);
        }
    }
}
