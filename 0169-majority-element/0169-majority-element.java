class Solution {
    public int majorityElement(int[] nums) {
        //  HashMap<Integer, Integer> map = new HashMap<>();

        //  for(int i = 0; i < nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }else {
        //         map.put(nums[i], 1);
        //     }
        //  }

        //  int max = Integer.MIN_VALUE;
        //  int ans = nums[0];

        //  for(Integer key : map.keySet()){
            
        //         if(map.get(key) > max){
        //             ans = key;
        //             max = map.get(key);
        //         } 
        //  }

        //  return ans;

        // 2 3 3 

        Arrays.sort(nums);

        int count = 1; 
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count > nums.length/2){
                    ans = nums[i];
                }
            }else {
               count = 1;
            }
        }


        return ans;

    }
}