class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        subsets(nums, 0, new ArrayList<>(), result);

        return result;
    }

    public static void subsets(int [] arr, int currIndex, List<Integer> current,  List<List<Integer>> result){

        if(currIndex >= arr.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[currIndex]);

        subsets(arr, currIndex+1, current, result);

        current.remove(current.size()-1);

        subsets(arr, currIndex+1, current, result);

    }
}