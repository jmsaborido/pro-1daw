import java.util.Scanner;

public class Entrada {

    private void Entrada() {
    }

    public static boolean llevaGafas() {
        System.out.println("¿El personaje lleva gafas?");
        Boolean a = new Scanner(System.in).nextBoolean();
        return a;
    }

    public static boolean esFumador() {
        System.out.println("¿El personaje es fumador?");
        Boolean a = new Scanner(System.in).nextBoolean();
        return a;
    }

    public static boolean llevaSombrero() {
        System.out.println("¿El personaje lleva sombrero?");
        Boolean a = new Scanner(System.in).nextBoolean();
        return a;
    }

    public static TipoColorPelo colorPelo() {
        String pelo;
        do {
            System.out.println("¿De que color tiene el pelo?");
            pelo = new Scanner(System.in).next();
            if (!(pelo.equals("AMARILLO")||pelo.equals("ROJO")||pelo.equals("NEGRO")||pelo.equals("BLANCO")))
                System.out.println("Color incorrecto");
        } while (!(pelo.equals("AMARILLO")||pelo.equals("ROJO")||pelo.equals("NEGRO")||pelo.equals("BLANCO")));
        return TipoColorPelo.valueOf(pelo);

    }
}
