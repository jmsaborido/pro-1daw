public class Principal {

    public static void main(String[] args) {
        System.out.println(contar('A', "ANACARDO", 'C'));
        System.out.println(contar('O', "EDUARDO", 'R'));


    }

    private static int contar(char c, String cadena, char maldito) {
        assert cadena != null : "Error: la cadena recibida no puedes seer null";
        assert caracterMaldito(cadena,maldito)!= -1: "Error: el caracter maldito no se encuentra en la cadena";


        int res = 0;

        for (int i = 0; i < caracterMaldito(cadena,maldito); i++) {
            if (cadena.charAt(i) == c)
                res++;
        }
        return res;
    }

    private static int caracterMaldito(String cadena, char maldito) {
        int pos = -1;

        for (int i = 0; i <cadena.length(); i++) {
            if (maldito == cadena.charAt(i)){
                pos = i;
                break;
            }
        }

        return pos;
    }

}
