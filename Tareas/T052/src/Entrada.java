import java.util.Scanner;

public class Entrada {

    private Entrada() {
    }

    private static void nombreCompleto(Persona p) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre: ");
        String nombre = sc.next();
        p.setNombre(nombre);

        System.out.print("Introduzca el primer apellido: ");
        String ape1 = sc.next();
        p.setApe1(ape1);

        System.out.print("Introduzca el segundo apellido: ");
        String ape2 = sc.next();
        p.setApe2(ape2);
    }

    private static void otrosDatos(Persona p) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el peso en Kg: ");
        int peso = sc.nextInt();
        p.setPeso(peso);

        System.out.print("Introduzca la altura (1,80): ");
        double altura = sc.nextDouble();
        p.setAltura(altura);
    }

    public static void leerOpcion() {
        String opciones = "SDF";
        String str = "";
        System.out.println("Menu de Opciones: \n S) Saludar \n D) Despedir \n F) Felitar");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una opción: ");
        String opcion = sc.next();

        if ((opciones.indexOf(opcion)) == -1)
            System.out.println("Opcion incorrecta");
        else if ((opciones.indexOf(opcion)) == 0)
            System.out.println("HOLA");
        else if ((opciones.indexOf(opcion)) == 1)
            System.out.println("ADIOS");
        else if ((opciones.indexOf(opcion)) == 2)
            System.out.println("FELICIDADES");
    }
}
