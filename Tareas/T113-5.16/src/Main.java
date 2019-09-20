public class Main {

    public static void main(String[] args) {
        String[] s1 = new String[]{"Pepe", "Manolo", "Juanito"};
        Curso c1 = new Curso(s1);
        System.out.println(c1);
        mostrar(c1.mediasA());
        float[] f1 = new float[]{0.3f, 0.5f, 0.2f};
        mostrar(c1.mediasP(f1));
        mostrar(c1.suspensos(1));
    }
    public static void mostrar(float[] valores) {
        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? "," : "";
            System.out.print(separador + valores[i]);
        }
        System.out.println();
    }

    public static void mostrar(Estudiante[] valores) {
        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? "," : "";
            System.out.print(separador + valores[i]);
        }
    }


}
