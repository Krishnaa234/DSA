class Subarray_sum {
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                if(arr[j]==0)
                    return true;
                else {
                    sum = sum + arr[j];
                    if(sum==0)
                        return true;
                }
            }
        }
        return false;
    }
}
