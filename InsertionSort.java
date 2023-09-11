//program for insertion sort
class InsertionSort
{
  static void insert(int arr[],int i)
  {
       int temp = arr[i];
       int j = i-1;
       while(j>=0 && temp<arr[j]) {
           arr[j+1] = arr[j];
           j--;
       }
       arr[j+1] = temp;
  }

  public void insertionSort(int arr[], int n)
  {
      for(int i = 0;i<n; i++) {
          insert(arr, i);
      }
  }
}
