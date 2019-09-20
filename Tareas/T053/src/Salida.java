import java.util.logging.Logger;

public class Salida {

    private Salida() {
    }

    public static void mostrar() {
        System.out.print("Bienvenidos al modulo de progamación Java");
    }

    public static void mostrarSl() {
        System.out.println("Bienvenidos al modulo de progamación Java");
    }

    public static void error() {
        String str = "Error inesperado";
        System.err.println(str);
        log(str);

    }

    private static void log(String mensaje) {
        System.err.print(mensaje+", el mensaje se ha guardado en el cuaderno de bitacora log");
    }
}
