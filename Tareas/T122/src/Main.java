import java.util.Arrays;

public class Main {

    /*
     * 5.20
     * https://docs.oracle.com/javase/10/docs/api/java/util/Random.html
     * la clase Random esta en el paquete util
     *Random rc = new Random();
     *El metodo nextInt sin parametros devuelve un numero entero aleatorio cualquiera
     *El metodo nextInt con 1 parametro int (Bound) devuelve un entero entre el 0 (inclusive) y el numero entero pasado(no incluido)
     *
     * https://docs.oracle.com/javase/10/docs/api/java/lang/Math.html
     * La clase Math esta en el paquete lang
     * Redondea un float a un entero
     * PI es el valor de un double que esta mas cerca que cualquier otro numero del numero pi.
     * */

    public static void main(String[] args) {
        String[] array={"hola","eclipse","fabercastell","iniciativaQ"};
        ordenarInsercionDirecta(array);
        System.out.println(Arrays.toString(array));

    }

    public static void ordenarInsercionDirecta(String[] array)
    {
        int j;
        String aux;
        for ( int i = 1; i < array.length; i++)
        {
            aux = array[i];
            j = i-1;
            while (j >= 0 && array[j].compareTo(aux)>0)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }


    /*

    * 5.22
    * equalsIgnoreCase(): Compara dos Strings ignorando mayusculas y minusculas.
    * startsWith(): Devuelve true si la cadena empieza por el prefijo enviado.
    * endsWith(): Devuelve true si la cadena termina por el sufijo enviado.
    * toLowerCase(): Convierte la cadena enviada a minusculas.
    * toUpperCase(): Convierte la cadena enviada a mayusculas.
    * trim(): Quita los espacios del final de la cadena pasada.
    * replace(): Cambia los caracteres enviados.
    * replaceFirst(): Cambia la primera ocurrencia de los caracteres enviados.
    * replaceAll(): Cambia todas las ocurrencias de los caracteres enviados.
    * indexOf(): Devuelve el indice de la primera ocurrencia del caracter enviado.
    * split(): Separa la cadena por el caracter enviado.
    * valueOf(): Devuelve la representacion en String del parametro enviado.
    *
    * */
}
