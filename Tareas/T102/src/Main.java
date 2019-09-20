public class Main {

    public static void main(String[] args) {
	int [] a  ={1,2,3,4,5};
	mostrar(a);
	System.out.println();
	rotarDerecha(a);
	mostrar(a);
    }

    public static void rotarDerecha (int[] numeros){
        if (numeros.length<2 || numeros==null)
            return;
        int aux=numeros[numeros.length-1];
        for (int i = numeros.length-1; i >0 ; i--)
            numeros[i]=numeros[i-1];
        numeros[0]=aux;
    }


    public static void mostrar (int []valores){
        if (valores==null || valores.length==0)
            return;
        for (int i = 0; i <valores.length ; i++) {
            String separador = (i!=0)? ",": "";
            System.out.print(separador+valores[i]);
        }
    }
}
