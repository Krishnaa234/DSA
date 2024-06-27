//GFG question
//1,3,6,10,15...

class Sum_of_series {
    static int findNthTerm(int N) {
        
        int sum=0;
        for(int i=0,k=1; i<N; i++, k++) {
            sum = sum + k;
        }
        return sum;
    }
}
