class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalNum = n * (n+1)/2;

        int currentSum = 0;

        for(int i = 0; i < n; i++){
            currentSum += nums[i]; 

        }

        return totalNum - currentSum;
    }
}