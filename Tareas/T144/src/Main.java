import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[][] a1 = {{1,2,3},{4,6},{7,8,9}};
	mostrarTranspuesta(a1);
    }

    public static void mostrarTranspuesta(int[][] array){


        }








    private static void mostrar(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                String separador = (j != 0) ? ", " : "";
                System.out.print(separador + a[i][j]);
            }
            System.out.println();
        }
    }
}
