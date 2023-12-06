//Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.

class Solution {
    public long[] findElements( long a[], long n)
    {
        Arrays.sort(a);
        long[] A = new long[(int)n-2];
        int i = 0, j = 0;
        while(j!=(n-2)){
            A[j] = a[i];
            i++;
            j++;
        }
        return A;
                
    }
}
