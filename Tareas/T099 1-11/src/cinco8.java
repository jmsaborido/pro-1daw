public class cinco8 {
    public static int[] par (int[]pares){
        assert pares!=null : "Error: array nula.";
        assert pares.length>0 : "Error: array vacia";
        int contador=0;
        int contador2=0;
        for (int i = 0; i <pares.length ; i++) {
            if(pares[i]%2==0)
                contador++;
        }
        int[] par=new int [contador];
        for (int i = 0; i <pares.length ; i++) {
            if(pares[i]%2==0) {
                par[contador2] = pares[i];
                contador2++;
            }

        }
        return par;
    }
}
