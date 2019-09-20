public class Main {

    public static void main(String[] args) {
        double[] a = {6.4, 9.2, 8.1};
        double[] b = {0.3, 0.2, 0.5};
        System.out.println(ponderada(a, b));

    }


    public static double ponderada(double[] a, double[] b) {
        assert a != null : "Error: El primer array es nulo";
        assert b != null : "Error: El segundo array es nulo";
        assert a.length >= 1 : "Error: La longitud de los array tiene que ser mayor que 0";
        assert a.length == b.length : "Error: Ambos arrays tienen que tener la misma longitud";
        double[] productos = new double[a.length];
        double dividendo = 0;
        double sumas = 0;

        for (int i = 0; i < b.length; i++) {
            sumas += b[i];
        }
        assert sumas == 1 : "Error: los pesos tienen que ser 1";
        for (int i = 0; i < a.length; i++) {
            productos[i] = (a[i] * b[i]);
        }
        for (int i = 0; i < a.length; i++) {
            dividendo += productos[i];
        }

        return dividendo;

    }
}
