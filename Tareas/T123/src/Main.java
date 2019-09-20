public class Main {

    public static void main(String[] args) {
        Aceituna[] aceitunas1 = new Tarro(3, "CHUPADEDO").getAceitunas();
        for (Aceituna a : aceitunas1) {
            System.out.println( a);
        }
    }
}
