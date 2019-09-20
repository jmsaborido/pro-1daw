public class Principal {

    public static void main(String[] args) {

        //System.out.println(and(0));
        System.out.println(or(5));

    }

    private static String and(int valor) {

        if (false && (valor++)== 0)
            return "El valor es: "+valor;
        else
            return "Expresión evaluada en cortocircuito";
    }

    private static String or(int valor){
        if (false || (valor++)==0)
            return "Expresión evaluada en cortocircuito";
        else
            return "El valor es: "+valor;

    }



}
