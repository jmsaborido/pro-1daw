import java.util.Scanner;

public class Entrada {

    private Entrada() {
    }

    public static void nombreCompleto(Persona p) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el nombre: ");
        p.setNombre(sc.next());

        System.out.print("Introduzca el primer apellido: ");
        p.setApe1(sc.next());

        System.out.print("Introduzca el segundo apellido: ");
        p.setApe2(sc.next());
    }

    public static void otrosDatos(Persona p) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el peso en Kg: ");
        p.setPeso(sc.nextInt());

        System.out.print("Introduzca la altura (1,80): ");
        p.setAltura(sc.nextDouble());
    }
}
