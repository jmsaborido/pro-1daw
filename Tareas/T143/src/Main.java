public class Main {

    public static void main(String[] args) {
        int[][] a1 = {{1}, {1, 2}, {1, 2, 3}};
        int[][] a2 = {{1,2,3}, {1, 2}, {1}};
        System.out.println(getLongMax(a1));
        System.out.println(getLongMax(a2));

    }

    public static int getLongMax(int[][] a1){
        assert a1!=null:"Error:el array no puede ser nulo";
        int aux =0;
        for (int i = 0; i <a1.length ; i++) {
            if (a1[i].length>aux)
                aux=a1[i].length;

            }

        return aux;
    }

}
