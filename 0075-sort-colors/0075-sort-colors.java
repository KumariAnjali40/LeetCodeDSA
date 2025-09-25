class Solution {
    public void sortColors(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count1++;
            }else if(nums[i] == 1){
                count2++;
            }else {
                count3++;
            }
        }
         int j = 0;
        while(count1 > 0){
           nums[j] = 0;
           count1--;
           j++;
        }

        while(count2 > 0){
            nums[j] = 1;
            count2--;
            j++;
        }

        while(count3 > 0){
            nums[j] = 2;
            count3--;
            j++;
        }
    }
}