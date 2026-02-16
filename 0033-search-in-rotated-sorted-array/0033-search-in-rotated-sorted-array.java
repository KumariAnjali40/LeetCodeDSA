class Solution {
    public int search(int[] nums, int target) {
        int searchInArr = solve(nums, target);

        return searchInArr;
    }

    public static int solve(int [] arr, int target){
        
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
         int mid = left + (right-left)/2;

         if(arr[mid] == target) return mid;

         if(arr[left] <= arr[mid]){
            //left part is sorted
            if(target >= arr[left] && target < arr[mid]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
          }else {
            //right part is sorted

            if(target > arr[mid] && target <= arr[right]){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        }

        return -1;
    }
}