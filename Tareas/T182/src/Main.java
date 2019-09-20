import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        Object x = Integer.valueOf(5);
        try {
            System.out.println((String) x);
        } catch (ClassCastException e) {
            System.out.println("No puedes mostrar x como String");
        }

        Nodo a = new Nodo(4);

        try {

            a.getSiguiente(); {

            }
        }catch (NoSuchElementException e){
            System.out.println("No hay elemento");
        }

        String j= "Eclipse";
        try {
            j.charAt(99);

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("No esta ese caracter");
        }

    }
}
