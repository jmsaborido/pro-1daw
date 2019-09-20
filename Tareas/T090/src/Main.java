public class Main {

    public static void main(String[] args) {
        funcionY(10);
    }

    public static Par funcionY(int y) {
        int res;
        int a =0;
        int b =0;
        if (y==0){
            a=b=0;
            System.out.printf("El par esta formado por los numeros a = %d y b = %d ",a,b );
            return new Par(a, b);
        } if (y==1){
            a=0;
            b=1;
            System.out.printf("El par esta formado por los numeros a = %d y b = %d ",a,b );
            return new Par(a, b);
        }
        for (a = 0; a < y; a++) {
            res = elevar(2, a);
            for (b = 0; b < y; b++) {

                if (y == (res * b)) {
                    System.out.printf("El par esta formado por los numeros a = %d y b = %d ",a,b );
                    return new Par(a, b);
                }
            }
        }
        System.out.println("No se ha encontrado el numero.");
        return null;
    }

    public static int elevar(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int res = 1;
        for (int i = 0; i < b; i++) {
            res = res * a;
        }
        return res;
    }


}
