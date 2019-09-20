import java.util.HashSet;

public class Main {



    public static void main(String[] args) {

        HashSet<Integer> conjunto1 = new HashSet<>();
        HashSet<Integer> conjunto2= new HashSet<>();
        conjunto1.add(1);
        conjunto2.add(1);
        conjunto1.add(3);
        conjunto2.add(3);
        conjunto1.add(5);
        conjunto2.add(5);
        conjunto1.add(2);
        conjunto1.add(4);
        System.out.println(Utility.pertenencia(conjunto1,conjunto2));
        System.out.println(Utility.inclusion(conjunto2,conjunto1));
        System.out.println(Utility.union(conjunto2,conjunto1));
        System.out.println(Utility.diferencia(conjunto1,conjunto2));
        System.out.println(Utility.interseccion(conjunto2,conjunto1));



    }
}
