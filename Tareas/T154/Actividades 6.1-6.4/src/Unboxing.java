import java.util.ArrayList;
import java.util.List;
public class Unboxing {
    public static void main(String[] args) {
        Integer i = -8; // (1) autoboxing de int a Integer
// Unboxing en paso de parámetros
        int va = valorAbsoluto(i);
        System.out.println("valor absoluto de " + i + " = " + va);
        List<Double> ld = new ArrayList<>();
        ld.add(Math.PI); // (2) autoboxing de double a Double
// Unboxing en asignación
        double pi = ld.get(0);
        System.out.println("pi = " + pi);
    }
    public static int valorAbsoluto(int i) {
        return (i < 0) ? -i : i;
    }
}