public class Principal {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Juan", "Administrador");
        Empleado e2 = new Empleado("Juan", "Administrador");
        System.out.println(e1.equals(e2));          // false
        System.out.println(e1==e2);                 // false

        System.out.println("-----------------------------------------------");

        Empleado e3 = new Empleado("Juan", "Administrador");
        Empleado e4 = e3;
        System.out.println(e3.equals(e4));          // true
        System.out.println(e3==e4);                 // true

        System.out.println("-----------------------------------------------");

        String s1 = "HOLA";
        String s2 = "HOLA";
        System.out.println(s1.equals(s2));           // true
        System.out.println(s1 == s2);                // true

        System.out.println("-----------------------------------------------");

        String s3 = new String("HOLA");
        String s4 = new String("HOLA");
        System.out.println(s3.equals(s4));            // true
        System.out.println(s3==s4);                   // false



    }
}
