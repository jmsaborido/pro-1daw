import java.util.Scanner;

public class interfazDiccionario {
    private Scanner sc = new Scanner(System.in);
    private int bucle = 0;
    private Diccionario d1;
    private String castellano;
    private String ingles;
    private Palabra p1;

    public interfazDiccionario(Diccionario d1) {
        interfaz(d1);


    }

    private void interfaz(Diccionario d1) {
        System.out.println("Bienvenido al Diccionario");
        do {
            System.out.println("------------------");
            System.out.println("Las opciones son:");
            System.out.println("1:Agregar palabra al diccionario");
            System.out.println("2:Eliminar palabra del diccionario");
            System.out.println("3:Mostrar diccionario");
            System.out.println("4:Ordenar el  diccionario");
            System.out.println("5:Obtener la traduccion de una palabra al ingles");
            System.out.println("6:Obtener la traduccion de una palabra al castellano");
            System.out.println("7:Obtener una palabra por un numero indicado");
            System.out.println("8:Obtener una palabra aleatoria");
            System.out.println("0:Salir");
            System.out.println("------------------");
            bucle = sc.nextInt();
            switch (bucle) {
                case 1:
                    System.out.println("Introduce la palabra en castellano");
                    castellano = sc.next();
                    System.out.println("introduce la palabra en ingles");
                    ingles = sc.next();
                    String[] s1 = {castellano, ingles};
                    p1 = new Palabra(s1);
                    d1.agregar(p1);
                    break;
                case 2:
                    System.out.println("Introduce la palabra en castellano");
                    castellano = sc.next();
                    System.out.println("introduce la palabra en ingles");
                    ingles = sc.next();
                    String[] s2 = {castellano, ingles};
                    p1 = new Palabra(s2);
                    d1.eliminar(p1);
                    break;
                case 3:
                    System.out.println(d1);
                    break;
                case 4:
                    d1.ordenar();
                    break;
                case 5:
                    System.out.println("introduce la palabra en castellano");
                    System.out.println(d1.obtenerIngles(sc.next()));
                    break;
                case 6:
                    System.out.println("introduce la palabra en ingles");
                    System.out.println(d1.obtenerCastellano(sc.next()));
                    break;
                case 7:
                    System.out.println("introduce el numero");
                    System.out.println(d1.palabra(sc.nextInt()));
                    break;
                case 8:
                    System.out.println(d1.palabra(1+(int) (Math.random()* (d1.getPalabras().length))));
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (bucle != 0);

    }
}
