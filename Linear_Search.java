public class Linear_Search {
    public static void main(String args[]) {
        int[] arr = {3, 45, 67, 2, 4, 78, 56, 23, 8};
        int key = 23;
        System.out.println("Target found at index: " + linearSearch(arr, key));
    }   

    static int linearSearch(int[] A, int k) {
        if(A.length == 0)
            return -1;
        
        for(int i=0; i<A.length; i++) {
            if(A[i] == k) {
                return i;
            }
        }
        
        return -1;
    }
}
