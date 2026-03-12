class Solution {
    public int splitArray(int[] nums, int k) {

        int n = nums.length;
        
        int low = 0;
        int high = 0;

        for(int i = 0; i < n; i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while (low < high){

            int mid = low + (high - low)/2;

            if(canAllocated(nums, n, k, mid)){
                high = mid;
            }else {
                low = mid+1;
            }
        }

        return low;
    }

    public static boolean canAllocated(int [] arr, int n, int k , int max){

        int subarray = 1;
        int currVal = 0;

        for(int i = 0; i < n; i++){
            if(currVal + arr[i] <= max ){
                currVal += arr[i];
            }else {
                subarray++;
                currVal = arr[i];
            }
        }

        return subarray <= k;
    }
}