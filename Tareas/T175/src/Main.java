public class Main {

    public static void main(String[] args) {
        // System.out.println(divEnt(1,0));
        // / by zero
        // System.out.println(divEnt(0,0));
        // / by zero
        // System.out.println(divEnt(0,-0));
        // / by zero
        System.out.println(Float.isNaN(divFloat(0.0F,0.0F)));
        // NaN
        // System.out.println(divDoub(0.0,0.0));
        // NaN
        // System.out.println(divFloat(0.0F,-0.0F));
        // NaN
        // System.out.println(divDoub(0.0,-0.0));
        // NaN
        // System.out.println(divFloat(-0.0F,-0.0F));
        // NaN
        // System.out.println(divDoub(-0.0,-0.0));
        // NaN
        // System.out.println(divFloat(-0.0F,0.0F));
        // NaN
        // System.out.println(divDoub(-0.0,0.0));
        // NaN
        // System.out.println(divFloat(1F,0.0F));
        // Infinity
        // System.out.println(divDoub(1,0.0));
        // Infinity
        // System.out.println(divFloat(1F,-0.0F));
        // -Infinity
        Double.isInfinite(divDoub(1,-0.0));
        // -Infinity
    }

    public static int divEnt(int num, int den) {
        return num / den;
    }

    public static float divFloat(float num, float den) {
        return num / den;
    }

    public static double divDoub(double num, double den) {
        return num / den;
    }
}
