public class Main {

    public static void main(String[] args) {
        String[]a1 = {"a","b","a","d"};
	    String[]a2 = {"a"};
	    mostrar(buscarLineal2(a1,a2));
    }
    public static String[] buscarLineal2(String[] a1, String[] a2) {
        assert a1 != null : "Error:El array de coches no puede ser nulo";
        assert a2 != null : "Error:El array de matriculas no puede ser nulo";

        int contador = 0;

        if (a1.length >= a2.length) {
            for (int i = 0; i < a2.length; i++) {
                for (int j = 0; j < a1.length; j++) {
                    if (a1[j].equals(a2[i]))
                        contador++;
                }
            }
            if (contador == 0)
                return new String[0];

            String[] ret = new String[contador];
            contador = 0;


            for (int i = 0; i < a2.length; i++) {
                for (int j = 0; j < a1.length; j++) {
                    if (a1[j].equals(a2[i])) {
                        if (contador == ret.length) {
                            break;
                        }
                        ret[contador] = String.format("Posicion " + i + "Valor %s",a1[j]);
                        contador++;
                    }
                }
            }
        } else
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < a2.length; j++) {
                    if (a1[i].equals(a2[j]))
                        contador++;
                }
            }
        if (contador == 0)
            return new String[0];
        String ret[] = new String[contador];
        contador = 0;


        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i].equals(a2[j])) {
                    if (contador == ret.length) {
                        break;
                    }
                    ret[contador] =ret[contador] = String.format("Posicion " + i + " Valor %s",a1[i]);
                    contador++;
                }
            }
        }


        return ret;
    }

    public static void mostrar(String[] valores) {
        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? ", " : "";
            System.out.print(separador + valores[i]);
        }
    }

}
