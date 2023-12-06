//Given two integers L, R, and digit X. Find the number of occurrences of X 
//in all the numbers in the range (L, R) excluding L and R.

class How_Many_X {
    int countX(int L, int R, int X) {
        int count=0, rem=0;
        for(int i=(L+1); i<R; i++){
            int n=i;
            while(n>0){
                rem = n%10;
                if(rem==X)
                    count++;
                n=n/10;
            }
        }
        return count;
        
    }
};
