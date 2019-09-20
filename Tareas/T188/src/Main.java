public class Main {

    public static void main(String[] args) {
        int [] a={1,2};
	try {
	   a[0]=a[3];
    }catch (IndexOutOfBoundsException e){
        System.out.println(1);
        System.err.println("excepcion 1");
        me1();
    }
    }

    public static void me1(){
        int [] a={1,2};
        try {
            a[0]=a[3];
        }catch (IndexOutOfBoundsException e){
            System.out.println(2);
            System.err.println("excepcion 2");
            me2();
        }

    }
    public static void me2(){
        int [] a={1,2};
        try {
            a[0]=a[3];
        }catch (IndexOutOfBoundsException e){
            System.out.println("3");
            System.err.println("excepcion 3");
            me3();
        }

    }
    public static void me3(){
        int [] a={1,2};
        try {
            a[0]=a[3];
        }catch (IndexOutOfBoundsException e){
            System.out.println("Hola caracola");
            System.err.println("excepcion 4");
        }

    }
}
