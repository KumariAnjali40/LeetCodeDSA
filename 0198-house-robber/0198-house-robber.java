class Solution {
    public int rob(int[] nums) {

      int [] dp = new int [nums.length];

      for(int i = 0; i < nums.length;i++){
        dp[i] = -1;
      }


        int ans = solve(nums, 0, dp);

        return ans;
    }

    public static int solve(int [] arr, int i, int [] dp){

        if(i >= arr.length) return 0;

        if(dp[i] != -1) return dp[i];
       
        int take = arr[i] + solve(arr, i+2, dp);

        int skip = solve(arr, i+1, dp);

        return Math.max(take, skip);
    }
}