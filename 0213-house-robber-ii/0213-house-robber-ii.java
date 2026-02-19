class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;

        if(nums.length == 1) return nums[0];

        int [] dp1 = new int [n];

        for(int i = 0; i < n; i++){
            dp1[i] = -1;
        }

        int [] dp2 = new int [n];

        for(int i = 0; i < n; i++){
            dp2[i] = -1;
        }

        int a = solve(nums, dp1, 0, n-1);

        int b = solve(nums, dp2, 1, n);

        return Math.max(a, b);
    }

    public static int solve(int [] arr, int [] dp , int start, int end){

        if(start >= end) return 0;

        if(dp[start] != -1) return dp[start];

        int take = arr[start]+ solve(arr, dp, start+2, end);

        int skip = solve(arr, dp, start+1, end);

        dp[start] = Math.max(take, skip);

        return dp[start];
    }
}