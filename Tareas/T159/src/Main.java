import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Animal> zoo = new TreeSet<>();
        zoo.add(new Animal("Topo","Tamadre"));
        zoo.add(new Animal("Perro","Tapadre"));


        for (Animal x : zoo)
            System.out.println(x+ " ");
    }
}
