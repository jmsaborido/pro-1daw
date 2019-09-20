public class Main {

    public static void main(String[] args) {
        System.out.println(sus2('a', 'E', "aasa"));
    }

    public static String sus2(char original, char nuevo, String cadena) {
        assert cadena!=null:"Error: la cadena no puede ser nula";

        if (!cadena.contains(String.valueOf(original))) {
            return "La cadena no contiene el caracter a sustituir";
        }
        char trozo;
        int contador = 0;
        String cadenaNueva = "";

        for (int i = 0; i <= cadena.length() - 1; i++) {
            trozo = cadena.charAt(i);
            if (contador == 2)
                cadenaNueva += cadena.charAt(i);
            else {
                if (trozo == original && contador == 1) {
                    cadenaNueva += nuevo;
                    contador++;
                    i++;
                }
                if (trozo == original && contador == 0) {
                    contador++;
                }
                if (i <= cadena.length() - 1)
                cadenaNueva += cadena.charAt(i);
            }

        }
        return cadenaNueva;
    }
}
