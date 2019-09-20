
public class Principal {

    public static void main(String[] args) {
        Departamento d1 = new Departamento("Informatica", 'I');
        Departamento d2 = new Departamento("Lengua y Literatura", 'L');
        Departamento d3 = new Departamento(null, 'L');

        Ordenador o1 = new Ordenador("Intel", 8, false);
        Ordenador o2 = new Ordenador("Intel", 8, true);
        System.out.println(d1);
        System.out.println(d2);


    }
}
