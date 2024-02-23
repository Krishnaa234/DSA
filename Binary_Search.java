public class Binary_Search {
  public static void main(String[] args) {
      int[] arr= {-18, -12, 0, 3, 8, 32, 56, 78};
      int target =0;
      System.out.println(binarySearch(arr, target));
  }

  static int binarySearch(int[] A, int key) {
      int start = 0, end = A.length-1;
      
      //find middle element
      //int mid = (start + end)/2; this may exceed the range of int in java
      while(start <= end) {
          int mid = start + (end - start)/2;
          if(key < A[mid]) {
              end = mid -1;
          }
          else if(key > A[mid]) {
              start = mid +1;
          }
          else if(key == A[mid]){
              return mid;
          }
      }
      return -1;
  }
}
