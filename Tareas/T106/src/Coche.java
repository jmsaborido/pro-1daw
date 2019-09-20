public class Coche {
    private String mat;
    private int num;

    public Coche(String mat, int num) {
        setMat(mat);
        setNum(num);
    }
    public Coche(String[] mat){
        creador(mat);
    }

    public int getNum() {
        return num;
    }

    private void setMat(String mat) {
        assert mat != null : "Error: Las matriculas no pueden ser nulas";
        assert comprobarMatricula(mat) : "Error: La matricula no encaja con el criterio 1111XXX siendo 1 numeros del 0 al 9 y X letras mayúsculas";
        this.mat = mat;
    }

    private void setNum(int num) {
        this.num = num;
    }

    public boolean comprobarMatricula(String matricula) {
        if (matricula.matches("^[0-9]{4}[A-Z]{3}$")) {
            return true;
        } else {
            return false;
        }
    }

    private static Coche[] creador(String[] mat) {
        Coche coche[] = new Coche[mat.length];
        for (int i = 0; i < mat.length; i++) {
            coche[i] = new Coche(mat[i], i + 1);

        }

        return coche;
    }



    public static  void mostrar(Coche[] valores) {
        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? ", " : "";
            System.out.print(separador + valores[i]);
        }
    }


    @Override
    public String toString() {
        return "Coche: " + String.valueOf(num) + "  Matricula: " + mat;
    }
}
