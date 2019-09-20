import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mostrar(habitacion());


    }

    public static String[][] habitacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas hay en la habitacion?");
        int n = sc.nextInt();
        String[] nombres = new String[n];
        String[][] a1 = new String[n][];

        for (int i = 0; i < n; i++) {
            System.out.println(String.format("Como se llama la persona %d?", i + 1));
            String temp = sc.next();
            nombres[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(String.format("¿Cuantos hijos tiene %s?", nombres[i]));
            int temp = sc.nextInt();
            a1[i] = new String[temp];
            a1[i][1] = String.valueOf(temp);

        }

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j <a1[i].length ; j++) {
                System.out.println(String.format("¿Cuantos años tiene el hijo %s de %s?", j+1, nombres[i]));
                int temp = sc.nextInt();
                a1[i][j]=String.valueOf(temp);
            }
        }

        return a1;
    }


    private static void mostrar(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                String separador = (j != 0) ? ", " : "";
                System.out.print(separador + a[i][j]);
            }
            System.out.println();
        }
    }
}
