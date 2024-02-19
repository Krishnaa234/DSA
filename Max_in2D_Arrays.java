public class Max_in2D_Arrays {
    public static void main(String[] args) {
        int[][] arr = { { 23, 4, 1 }, { 18, 12, 3, 9 }, { 78, 99, 34, 56 }, { 18, 12 } };
        System.out.println("Maximum value in 2D array is: " + max(arr));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    static int max(int[][] A) {
        int m = A[0][0];
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                if(A[i][j] > m)
                    m = A[i][j];
            }
        }
        return m;
    }
}
