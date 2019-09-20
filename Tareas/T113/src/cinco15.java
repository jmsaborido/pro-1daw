public class cinco15 {
    public static int[][] matrizIdentidad(int n){
        int[][] id= new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j <n ; j++)
                id[i][j] = i==j?1:0;

        return id;
    }
}
