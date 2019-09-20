public class Main {

    public static void main(String[] args) {
        System.out.println(sumar(1,2,3,4,5,6,7,8,9));

    }

    public static int sumar (int ... numeros){
        int suma=0;
        for (int i = 0; i <numeros.length ; i++) {
            suma=suma+numeros[i];
        }
        return suma;
    }
}
