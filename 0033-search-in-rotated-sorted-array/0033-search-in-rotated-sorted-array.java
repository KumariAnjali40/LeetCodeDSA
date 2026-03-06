class Solution {
    public int search(int[] nums, int target) {
        int searchInArr = solve(nums, target);

        return searchInArr;
    }

    public static int solve(int [] arr, int k){

        int left = 0;
        int right = arr.length - 1; 

        while (left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == k) return mid;

            if(arr[left] <= arr[mid]){
                if( k >= arr[left] && k < arr[mid]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {
                if(k <= arr[right] && k > arr[mid]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }

        return -1;
    }
}