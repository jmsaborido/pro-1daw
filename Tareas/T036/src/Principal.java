public class Principal {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Juanito");
        Empleado e2 = new Empleado("Antonio");
        Empleado e3 = new Empleado("Pepe");

//        Empleado e4 = new Empleado(null);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        Util.mostrarAnyos(1990);

    }
}
