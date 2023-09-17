//You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. 
//You can only see the k numbers in the window. Each time the sliding window moves right by one position.
//Return the max sliding window.

// ---Leetcode

class Sliding_Window_Max {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        if(k==1)
            return nums;
        for(int i=0; i<k; i++) {
            max = Math.max(nums[i], max);
        }
        int n = nums.length, p=1;
        if(k==n)
            return new int[]{max};
        int[] res = new int[n - k + 1];
        res[0] = max;
        for(int i=k; i<nums.length; i++){
            if(max == nums[i-k]) {
                max = Integer.MIN_VALUE;
                for(int j = i-k+1; j<i+1; j++) {
                    max = Math.max(nums[j], max);
                }
            }
            if(max < nums[i]) {
                max = nums[i];
                res[p++] = nums[i];
            }
            else {
                res[p++] = max;
            }
        }
        return res;
    }
}
