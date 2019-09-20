public class Main {

    public static void main(String[] args) {
        String[] mat = {"9789ACD", "9456AXS", "1234ABC", "5555AAA"};
        Coche.mostrar(creador(mat));
    }

    public static Coche[] creador(String[] mat) {
        Coche coche[] = new Coche[mat.length];
        for (int i = 0; i < mat.length; i++) {
            coche[i] = new Coche(mat[i], i + 1);

        }

        return coche;
    }
}
