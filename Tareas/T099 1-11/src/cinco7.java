public class cinco7 {
    public static int max(int[] max){
        assert max!=null : "Error: array nula.";
        assert max.length>0 : "Error: array vacia";
        int aux=max[0] ;
        for (int i = 1; i <max.length ; i++) {
            if (max[i]>aux)
                aux=max[i];
        }
        return aux;

    }
}
