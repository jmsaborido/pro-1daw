public class Main {

    public static void main(String[] args) {
        System.out.println(contar("aeiou", "programacion"));
    }

    /**
     * nombre contar
     * descripcion  cuenta cuantos caracteres de una cadena hay en otra cadena.
     * @param caracteres es la cadena de caracteres que queremos buscar  (No nulo, no vacio, cada caracter es unico)
     * @param texto es la cadena en la que se van a buscar los caracteres (No nulo, no vacio)
     * @return devuelve el parametro contador que cuenta el numero de repeticiones.
     */
    private static int contar(String caracteres, String texto) {

        assert texto != null : "Error: La cadena no puede ser nula.";
        assert !texto.isEmpty() : "Error: La cadena no puede ser vacia.";
        assert caracteres != null : "Error: La cadena no puede ser nula.";
        assert !caracteres.isEmpty() : "Error: La cadena no puede ser vacia.";
        int contador = 0;
        for (int i = 0; i < caracteres.length(); i++) {
            for (int j = i; j < caracteres.length(); j++) {

                if (i != j) {
                    if ((caracteres.charAt(j) == caracteres.charAt(i))) {
                        System.err.println( "Error: Has pasado caracteres repetidos.");
                        return 0;
                    }
                }
            }
        }
        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < caracteres.length(); j++) {


                if ((caracteres.charAt(j) == texto.charAt(i))) {
                    contador++;
                }
            }
        }
        return contador;
    }


}


