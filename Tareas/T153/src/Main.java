import java.text.Collator;

public class Main {

    public static void main(String[] args) {
        Collator comparador = Collator.getInstance();


        System.out.println("PRIMER NIVEL DE FUERZA");
        comparador.setStrength(Collator.PRIMARY);

        System.out.println( "NO DISTINGUE ENTRE TILDES , TIPOS DE VOCALES Y/O MAYUSCULAS Y MINUSCULAS");
        System.out.println(comparador.compare("cana", "caña")); //
        System.out.println(comparador.compare("facil", "fácil"));
        System.out.println(comparador.compare("facil", "facil"));
        System.out.println(comparador.compare("Cana", "Caña"));
        System.out.println(comparador.compare("pingüino", "pinguino"));
        System.out.println(comparador.compare("FACIL", "fÁCIL"));
        System.out.println(comparador.compare("facil", "fácil"));


        System.out.println("SEGUNDO NIVEL DE FUERZA");
        System.out.println("DISTINGUE ENTRRE TILDES Y TIPOS DE VOCALES");
        System.out.println("NO DISTINGUE ENTRE MAYUCULAS Y MINUSCULAS");
        comparador.setStrength(Collator.SECONDARY);
        System.out.println(comparador.compare("cana", "caña")); //
        System.out.println(comparador.compare("facil", "fácil"));
        System.out.println(comparador.compare("Facil", "facil"));
        System.out.println(comparador.compare("Cana", "Caña"));
        System.out.println(comparador.compare("pingüino", "pinguino"));
        System.out.println(comparador.compare("FACIL", "fÁCIL"));
        System.out.println(comparador.compare("facil", "fácil"));

        System.out.println("TERCER NIVEL DE FUERZA");
        System.out.println("DISTINGUE ENTRE TILDES , TIPOS DE VOCALES Y/O MAYUSCULAS Y MINUSCULAS");
        comparador.setStrength(Collator.TERTIARY);
        System.out.println(comparador.compare("cana", "caña")); //
        System.out.println(comparador.compare("facil", "fácil"));
        System.out.println(comparador.compare("facil", "Facil"));
        System.out.println(comparador.compare("Cana", "Caña"));
        System.out.println(comparador.compare("pingüino", "pinguino"));
        System.out.println(comparador.compare("FACIL", "fÁCIL"));
        System.out.println(comparador.compare("facil", "fácil"));
    }
}