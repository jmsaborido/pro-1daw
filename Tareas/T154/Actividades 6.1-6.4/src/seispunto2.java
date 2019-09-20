import java.util.List;

public class seispunto2 {
    public static int sumarPares(List<Integer> li) {
        int sum = 0;
        for (Integer i: li)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }
}
// se da unboxing de Integer a int