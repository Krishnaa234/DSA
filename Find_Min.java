public class Find_Min {
    public static void main(String[] args) {
        int[] arr = {16, 5, 34, -2, 0, -5};
        System.out.println(min(arr));
    }

    static int min(int[] A) {
        if(A.length == 0)
            return -1;

        int m = A[0];
        for( int i=0; i<A.length; i++) {
            if(A[i] < m) {
                m = A[i];
            }
        }
        return m;
    }
}
