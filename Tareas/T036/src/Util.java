public class Util {

    private Util() {
    }

    public static void mostrarAnyos(int fechaNac) {
        System.out.println("El empleado tiene "+ calculaAnyo(fechaNac)+" años");
    }

    private static int calculaAnyo(int fechaNac) {
        return 2018-fechaNac;
    }
}
