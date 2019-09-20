public class Main {

    public static void main(String[] args) {

        Fila a1 = new Fila();
        a1.agregar(new Persona("-1"));
        a1.setPrimero(new Persona("0"));
        for (int i = 1; i <= 10; i++) {
            a1.agregar(new Persona(String.valueOf(i)));
        }
        System.out.println(a1);
        System.out.println(a1.mostrarPrimero());
        a1.pasarTurno();
        a1.setPrimero(new Persona("juan"));
        System.out.println(a1);
        System.out.println(a1.posicion(new Persona("10")));
    }
}
