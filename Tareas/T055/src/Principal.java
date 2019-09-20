public class Principal {

    public static void main(String[] args) {
        Persona p1 = new Persona("Jose",1990);

        System.out.println(p1.mostarEdad());
        System.out.println(Persona.mostrarEdad(1990));
    }

}