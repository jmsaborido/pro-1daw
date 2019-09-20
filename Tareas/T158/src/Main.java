import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("Juan y medio");
        a1.add("Ruben Castro");
        a1.add("Daniel Güiza");
        a1.add("Torrente");
        a1.add("Colacado");
        Pelicula eclipse = new Pelicula("eclipse", a1);
        Map<Pelicula, LinkedList<String>> entrada = new HashMap<Pelicula, LinkedList<String>>();
        entrada.put(eclipse,a1);

        Iterator it = entrada.keySet().iterator();
        while(it.hasNext()){
            Pelicula key = (Pelicula) it.next();
            System.out.println("Pelicula: " + key + " -> Reparto: " + entrada.get(key));
        }

    }
}
