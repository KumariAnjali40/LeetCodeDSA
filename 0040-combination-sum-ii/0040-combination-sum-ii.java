class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        solve(candidates,target, new ArrayList<>(), result,0 );

        return result;
    }

    public static void solve(int [] arr, int target, List<Integer> curr, List<List<Integer>> ans, int index){

        if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(curr));
                return;
            }
        }

        if(index >= arr.length || target < 0){
            return;
        }

        curr.add(arr[index]);

        solve(arr, target-arr[index], curr, ans, index+1);

        curr.remove(curr.size()-1);

        int next = index+1;
        while(next < arr.length && arr[index] == arr[next]){
           next++;
        }

        solve(arr, target, curr, ans, next);
    }
}