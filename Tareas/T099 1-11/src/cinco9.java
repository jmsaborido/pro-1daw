public class cinco9 {
    public static void rotarDerecha (int[] numeros){
        if (numeros.length<2 || numeros==null)
            return;
        int aux=numeros[numeros.length-1];
        for (int i = numeros.length-1; i >0 ; i--)
            numeros[i]=numeros[i-1];
            numeros[0]=aux;
    }
}
