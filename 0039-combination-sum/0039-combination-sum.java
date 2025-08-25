class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        findCombination(candidates,target,0, new ArrayList<>(), ans);

        return ans;
    }

    public static void findCombination(int [] arr, int target, int index,List<Integer>curr, List<List<Integer>>ans ){

        if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        if(arr[index] <= target){
            curr.add(arr[index]); 
            findCombination(arr, target-arr[index], index, curr, ans);

            curr.remove(curr.size()-1);
        }

        findCombination(arr, target, index+1, curr, ans);
    }
}