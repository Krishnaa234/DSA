//Given an array of n integers. Find the minimum non-negative number to be inserted in array, so that sum of all elements of array becomes prime.

class Transform_to_prime
{
    public int minNumber(int arr[], int N)
    {
        int sum=0;
        for(int i=0; i<N; i++){
            sum = sum + arr[i];
        }
        
        if(sum == 1){
            return 1;
        } 
        
        if(sum == 2){
            return 0;
        }
        
        int m = sum;
        while(!isPrime(m)){
            m++;
        }
        return m - sum;
    }
    
    public boolean isPrime(int m ){
        for(int i = 2 ; i < m;i++){
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }
}
