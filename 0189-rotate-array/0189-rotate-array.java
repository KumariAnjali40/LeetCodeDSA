class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if(k == 0) return;

        int [] temp = new int [n-k];

        for(int i = 0; i < n-k; i++){
            temp[i] = nums[i];
        }
     
       int j = 0;
       for(int i = n-k; i < n; i++){
         nums[j] = nums[i];
         j++;
       }
       int r = 0;

       for(int i = k; i < n; i++ ){
         nums[i] = temp[r];
         r++;
       }

    }
}