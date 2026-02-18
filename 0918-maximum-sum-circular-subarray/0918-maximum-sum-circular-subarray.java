class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMax = 0, maxSum = nums[0];
        int currMin = 0, minSum = nums[0];

        for(int x : nums){
            totalSum += x;

            // currMax = Math.max(x, currMax + x);
            // maxSum = Math.max(maxSum, currMax);

            // // Min subarray (Kadane for min)
            // currMin = Math.min(x, currMin + x);
            // minSum = Math.min(minSum, currMin);

            if(currMax < 0){
                currMax = 0;
            }

            currMax += x;

            maxSum = Math.max(currMax, maxSum);

            if(currMin > 0){
                currMin = 0;
            }

            currMin += x;

            minSum = Math.min(currMin, minSum);
        }

        // If all numbers are negative, circular max = max subarray
        if(maxSum < 0) return maxSum;

        // Max of normal or circular subarray
        return Math.max(maxSum, totalSum - minSum);
    }
}
