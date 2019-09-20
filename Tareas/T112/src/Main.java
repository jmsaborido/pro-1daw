public class Main {

    public static void main(String[] args) {
        char[]a ={'a','b','c','d'};
        System.out.println(buscarDicotomica(a,'a'));
    }
    public static boolean buscarDicotomica(char[] chars, char valorBuscado)
    {
        assert ordenado(chars) : "Error: El array de caracteres debe de estar ordenado";
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = chars.length-1;
        int mitad;
        while (izquierda<=derecha && !encontrado)
        {
            mitad = (izquierda + derecha) / 2;
            if (chars[mitad] == valorBuscado)
                encontrado = true;
            else if (chars[mitad] > valorBuscado)
                derecha = mitad - 1;
            else
                izquierda = mitad + 1;
        }
        return encontrado;
    }
    public static boolean ordenado(char[] a) {
        assert a != null : "Error: El array es nulo";
        if (a.length <= 1)
            return true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return false;
        }

        return true;
    }
}
