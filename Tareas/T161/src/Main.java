import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TipoColor[] aux= TipoColor.values();
        SortedSet<Color> a1= new TreeSet<>();
        for (int i = 0; i <TipoColor.values().length ; i++) {
            a1.add(new Color(aux[i]));

        }
        System.out.println( a1);
    }
}
