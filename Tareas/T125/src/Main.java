import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mostrar(hijos());


    }

    public static Persona[] hijos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos hijos tienes");
        Persona[] hijos = new Persona[sc.nextInt()];
        for (int i = 0; i < hijos.length; i++) {
            System.out.println("Como se llama el hijo numero " + (i+1));
            hijos[i] = new Persona(sc.next());
        }
        return hijos;
    }

    public static void mostrar(Persona[] valores){
        if (valores==null || valores.length==0)
            return;
        for (int i = 0; i <valores.length ; i++) {
            String separador = (i!=0)? ", ": "";
            System.out.print(separador+valores[i]);
        }
    }
}
