import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] a ={'A','B','C','D','E'};
        mostrar(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mostrar (char []valores){
        if (valores==null || valores.length==0)
            return;
        for (int i = 0; i <valores.length ; i++) {
            String separador = (i!=0)? ",": "";
            System.out.print(separador+valores[i]);
        }
    }
}
