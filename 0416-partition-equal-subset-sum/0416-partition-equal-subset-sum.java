class Solution {
    public boolean canPartition(int[] nums) {

        int n = nums.length;

        int totalSum = 0;
        
        for(int i = 0; i < n; i++ ){
            totalSum += nums[i];
        }

        if(totalSum % 2 != 0){
            return false;
        }

        int newSum = totalSum/2 ;

        Boolean[][] dp = new Boolean[n][newSum + 1];

        boolean ans = solve(n, nums, dp, newSum, 0 );

        return ans;
    }

    public static boolean solve(int n, int [] arr, Boolean [][] dp, int sum, int index ){

        if(sum == 0){
            return true;
        }

        if(index == arr.length){
            return false;
        }
       
        if (dp[index][sum] != null) return dp[index][sum];

        boolean exclude = solve(n, arr, dp, sum, index+1);

        boolean include = false;

        if(sum >= arr[index]){
            include = solve(n,arr, dp, sum - arr[index], index+1);
        }

        dp[index][sum] = include || exclude;

        return dp[index][sum];
    }
}