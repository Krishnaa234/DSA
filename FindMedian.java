// You don't need to read or print anything. Your task is to complete the function find_median() 
// which takes the array as input parameter and return the floor value of the median.

class FindMedian
{
    public int find_median(int[] v)
    {
        int min = v[0], mid=0;
        int n = v.length;
        Arrays.sort(v);
        if(n%2==0) {
            int m1 = v[n/2];
            int m2 = v[n/2-1];
            mid = (m1+m2)/2;
        }
        else{
            mid = v[n/2];
        }
        return mid;
    }
}
