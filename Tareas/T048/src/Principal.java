public class Principal {

    public static void main(String[] args) {
        Persona p1 = new Persona();

        Entrada.nombreCompleto(p1);
        Entrada.otrosDatos(p1);

        System.out.println(p1);

    }

}
