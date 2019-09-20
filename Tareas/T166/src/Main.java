import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();
         for (int i = 0; i <=10 ; i++) {
             a1.add(fibonacci(i));
         }
        System.out.println(a1);
    }

    public static int fibonacci(int n) {
        assert n > 0 : "Error: no se permiten numero negativos";
        int prim = 1, seg = 0, res = -1, cont = 0;
        while (cont < n) {
            res = prim + seg;
            prim = seg;
            seg = res == 0 ? 1 : res;
            cont++;
        }
        return res == -1 ? 0 : res;
    }
}