class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        int ans1 = getMax(nums, 0, n-1);
        int ans2 = getMax(nums, 1, n);

        return Math.max(ans1, ans2);
        
    }

    public static int getMax(int [] arr, int start,int end){
        
         int prev = 0; // dp[n-1]
         int prev2 = 0; //dp[n-2]

         for(int i = start; i < end; i++){
            int temp = arr[i];
            
            int take = temp + prev2;

            int notTake = prev;

            int max = Math.max(take, notTake);

            prev2 = prev;
            prev = max;

         }

        return prev;
    }
}