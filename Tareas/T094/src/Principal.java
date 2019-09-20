public class Principal {

    public static void main(String[] args) {
        System.out.println(repetidos1("PARAPETAR"));
        System.out.println(repetidos2("PARAPETAR"));
        System.out.println(repetidos3("PARAPETAR"));
    }

    private static String repetidos1(String cadena){

        assert cadena != null : "Error: el string introducido no puede ser null";
        String aux = "";
        if (cadena.length() < 2) {
            return cadena;
        }

        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < cadena.length(); j++) {
                if (i != j) {
                    if (cadena.charAt(i) == cadena.charAt(j)) {
                        aux += cadena.charAt(j);
                        break;
                    }
                }
            }
        }
        return aux;
    }


    private static String repetidos2(String cadena){

        assert cadena != null : "Error: el string introducido no puede ser null";


        if (cadena.length() < 2) {
            return cadena;
        }

        String aux = "";
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = cadena.length()-1; j > i; j--) {
                if (cadena.charAt(i) == cadena.charAt(j) && aux.indexOf(cadena.charAt(i)) == -1){
                    aux += cadena.charAt(i);
                    break;
                }
            }
        }
        return  aux;
    }

    private static String repetidos3(String cadena){

        assert cadena != null : "Error: el string introducido no puede ser null";


        if (cadena.length() < 2) {
            return cadena;
        }


        String aux = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (aux.indexOf(cadena.charAt(i)) == -1)
                aux += cadena.charAt(i);
        }
        return  aux;
    }

}
