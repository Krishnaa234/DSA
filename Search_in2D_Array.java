import java.util.*;

public class Search_in2D_Array {
    public static void main(String[] args) {
        int[][] arr = { {23, 4, 1}, {18, 12, 3, 9}, {78, 99,34,56}, { 18, 12}};
        int key = 9;
        System.out.println("Number found in 2D array at index: " + Arrays.toString(search(arr, key)));
        //prints like [2,2]
    }

    static int[] search(int[][] A, int k) {
        if(A[0][0] == 0)
            return new int[] {0,0};
        int m = A[0][0];
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                if(A[i][j] == k)
                    return new int[] {i,j}; //created a new 1D array
            }
        }
        return new int[] {-1,-1};
    }
}
