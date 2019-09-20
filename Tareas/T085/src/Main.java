public class Main {

    public static void main(String[] args) {
        System.out.println(en('a', "hola"));
        System.out.println(en2('x', "hola"));

    }

    public static boolean en(char caracter, String cadena) {
        boolean en = false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                en = true;
                break;
            }
        }
        return en;
    }

    public static boolean en2(char caracter, String cadena) {
        return cadena.contains(String.valueOf(caracter));
    }

}
