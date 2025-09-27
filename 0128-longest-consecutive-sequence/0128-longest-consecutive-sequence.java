class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int max = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
              int currNum = num;

               int currMax = 1;

               while(set.contains(currNum + 1)){
                 currMax += 1;
                  currNum += 1;
               }

               max = Math.max(currMax, max);
            }
            
        }

        return max;
    }
}