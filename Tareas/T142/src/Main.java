import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a1 = {5, 1, 6, 7, 0, 2};
	    Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.binarySearch(a1,5));
        Arrays.fill(a1, 5);
        System.out.println(Arrays.toString(a1));
    }
}
