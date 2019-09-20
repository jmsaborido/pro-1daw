public class Main {
    public static void main(String[] args) {
        Intervalo a1 = new Intervalo(4,7);
        System.out.println(a1.solapamiento(new Intervalo(1,6)));        //  Fuera por la izquierda pero dentro
        System.out.println(a1.solapamiento(new Intervalo(6,20)));       //  Fuera por la derecha pero dentro
        System.out.println(a1.solapamiento(new Intervalo(1,4)));        //  Fuera por la izquierda pero coincide con el limite
        System.out.println(a1.solapamiento(new Intervalo(7,20)));       //  Fuera por la izquierda pero coincide con el limite
        System.out.println(a1.solapamiento(new Intervalo(1,20)));       //  Fuera por ambos lados, pero esta dentro
        System.out.println(a1.solapamiento(new Intervalo(5,6)));        //  Dentro completamente
        System.out.println(a1.solapamiento(new Intervalo(-2,1)));       //  Fuera por la izquierda
        System.out.println(a1.solapamiento(new Intervalo(9,20)));       //  Fuera por la derecha
        System.out.println(a1.solapamiento(new Intervalo(4,6)));        //  Empieza en limite de la izquierda y termina dentro
        System.out.println(a1.solapamiento(new Intervalo(5,7)));        //  Fmpieza dentro y termina en limite por la derecha


    }
}

