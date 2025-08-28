class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0; 
        int right = 0;
        int maxSum = 0;
        int currentSum = 0;

        while(right < nums.length){



            while(map.containsKey(nums[right])){
                int leftNum = nums[left];

                map.put(leftNum, map.get(leftNum)-1);

                if(map.get(leftNum) == 0){
                    map.remove(leftNum);
                }
                currentSum -= nums[left];
                left++;
            }

            map.put(nums[right], 1);

             currentSum += nums[right];

            maxSum = Math.max(maxSum, currentSum);

          right++;
        }

        return maxSum;
    }
}