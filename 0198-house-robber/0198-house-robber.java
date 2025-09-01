class Solution {
    public int rob(int[] nums) {

        int [] dp = new int [nums.length+1];

        for(int i = 0; i < nums.length; i++){
            dp[i] = -1;
        }
        
        int ans = robber(nums, 0, dp);

        return ans;
    }

    public static int robber (int [] arr, int index, int [] dp){

         if (index >= arr.length) {
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        int steal = arr[index] + robber(arr, index + 2, dp);
        int skip = robber(arr, index + 1, dp);

        dp[index] = Math.max(steal, skip);
        return dp[index];
    }
}