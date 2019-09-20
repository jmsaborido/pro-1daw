public class Principal {

    public static void main(String[] args) {

        System.out.println(evaluar(1));
        System.out.println(evaluar(0));
        System.out.println(evaluar(-1));
    }

    private static boolean evaluar(int x) {
        return (x>0) || (x<0);
    }


}
