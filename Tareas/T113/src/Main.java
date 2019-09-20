public class Main {

    public static void main(String[] args) {
    int [] a ={1,2,3,4,5};
//        System.out.println(cinco13.buscarLineal(a,6));
        mostrar(cinco15.matrizIdentidad(10));
    }

    private static void mostrar(int[][] a) {
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
