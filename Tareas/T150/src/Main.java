import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el peso");
        double earthWeight =sc.nextDouble();
        double mass = earthWeight / Planeta.EARTH.surfaceGravity();
        for (Planeta p : Planeta.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }
}
