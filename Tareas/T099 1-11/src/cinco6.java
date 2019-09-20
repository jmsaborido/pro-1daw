public class cinco6 {
    public static double media (double[] notas){
        assert notas!=null : "Error: array nula.";
        assert notas.length>0 : "Error: array vacia";
        double aux=0;
        for (int i = 0; i <notas.length ; i++) {
            aux+=notas[i];
        }
        return aux/notas.length;

    }
}
