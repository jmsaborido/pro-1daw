
public class Diccionario {

    private Palabra[] palabras;
    private final int MAXPALABRAS = 40;
    private int numPalabras;
    private int posicion = -1;

    public Diccionario(Palabra[] palabras) {
        setPalabras(palabras);
    }

    private void setPalabras(Palabra[] palabras) {
        numPalabras = palabras.length;
        assert numPalabras <= MAXPALABRAS : "Error: El numero de palabras es mayor que la capacidad del diccionario";
        this.palabras = palabras;
    }

    public void ordenar() {
        Palabra aux;
        for (int i = 0; i < numPalabras; i++) {
            for (int j = 1; j < (numPalabras - i); j++) {
                if (palabras[j - 1].getCastellano().compareTo(palabras[j].getCastellano()) > 0) {
                    aux = palabras[j - 1];
                    palabras[j - 1] = palabras[j];
                    palabras[j] = aux;
                }
            }

        }

    }

    public void agregar(Palabra p1) {
        assert p1 != null : "Error : La palabra no puede ser nula";
        int longitud = numPalabras;
        assert numPalabras < MAXPALABRAS : "Error: El dicionario esta lleno";

        for (int i = 0; i < numPalabras; i++) {
            if (p1.equals(palabras[i]))
                assert false : "Error: Palabra ya presente en el diccionario";
        }
        Palabra[] p2 = new Palabra[numPalabras + 1];
        for (int i = 0; i < numPalabras; i++) {
            p2[i] = palabras[i];
        }
        p2[numPalabras] = p1;
        setPalabras(p2);

    }

    public void eliminar(Palabra p1) {
        assert p1 != null : "Error : La palabra no puede ser nula";


        for (int i = 0; i < numPalabras; i++) {
            if (p1.equals(palabras[i]))
                posicion = i;
        }
        assert posicion != -1 : "Error: La palabra a eliminar no esta en el diccionario";

        Palabra[] p2 = new Palabra[numPalabras - 1];

        for (int i = 0, j = 0; i < numPalabras; i++) {
            if (i == posicion) {
                continue;
            }
            p2[j] = palabras[i];
            j++;
        }
        setPalabras(p2);
    }

    public String obtenerIngles(String s1) {
        for (int i = 0; i < numPalabras; i++) {
            if (palabras[i].getCastellano().equals(s1))
                return palabras[i].getIngles();
        }
        return "Palabra no encontrada";
    }

    public String obtenerCastellano(String s1) {
        for (int i = 0; i < numPalabras; i++) {
            if (palabras[i].getIngles().equals(s1))
                return palabras[i].getCastellano();
        }
        return "Palabra no encontrada";
    }

    public Palabra palabra(int aux) {
        assert aux > 0 : "Error: Me tienes que pasar numeros mayores que 0";
        assert aux < numPalabras : String.format("Error: El numero tiene que ser inferior al numero de palabras, has pasado %d y el maximo es %d", aux, numPalabras);
        aux = aux - 1;
        return palabras[aux];

    }

    public Palabra[] getPalabras() {
        return palabras;
    }

    @Override
    public String toString() {
        String toString = "";
        if (palabras == null || palabras.length == 0)
            return toString;
        for (int i = 0; i < palabras.length; i++) {
            String separador = (i != 0) ? ", " : "";
            toString = toString + separador + palabras[i];
        }

        return toString;
    }
}
