// There are N children standing in a line. Each child is assigned a rating value given in the integer array ratings.
// You are giving candies to these children subjected to the following requirements:

// 1. Each child must have atleast one candy.
// 2. Children with a higher rating than its neighbors get more candies than their neighbors.
// Return the minimum number of candies you need to have to distribute.

class Candy {
    static int minCandy(int N, int ratings[]) {
        // code here
        int candy=0;
        int[] candies = new int[N];
        Arrays.fill(candies,1);
        
        //left to right
        for(int i=1; i<N; i++) {
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1;
            }
        }
        
        //right to left
        for(int i=N-2; i>=0; i--) {
            if(ratings[i] > ratings[i+1])
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
        }
        
        for(int j : candies) {
            candy += j;
        }
        
        return candy;
    }
}
