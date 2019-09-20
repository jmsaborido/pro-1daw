public class cinco13 {
    public static int buscarLineal(int[] numeros, int valorBuscado)
    {
        int aux =-1;
        boolean encontrado = false;
        int i = 0;
        while (i < numeros.length && !encontrado)
            if (numeros[i] == valorBuscado) {
                encontrado = true;
                aux = i;
            }else
                i++;
        return aux;
    }
}
