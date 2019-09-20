public class Main {

    public static void main(String[] args) {
	int [] a = {1,2,3,4,5};
	mostrar(a);
	invertir(a);
	System.out.println();
	mostrar(a);
    }


    public static void invertir(int[] valores) {
        assert valores!=null : "Error:El array no puede ser nulo";
        int longitud = valores.length;
        assert longitud>1 : "Error:El array no puede ser nulo";
        int aux = 0;
        int limiteDerecha = longitud - 1;

        for (int i = 0; i < longitud / 2; i++) {
            aux = valores[i];
            valores[i] = valores[limiteDerecha];
            valores[limiteDerecha] = aux;
            limiteDerecha--;


        }
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
