class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        List<List<Integer>> result = new ArrayList<>();

        findCombination(arr, 0, k, new ArrayList<>(), result);

        return result;

    }
    public static void findCombination(int [] arr, int index, int target, List<Integer> curr, List<List<Integer>> ans){

       
       if(curr.size() == target){
        ans.add(new ArrayList<>(curr));
        return;
       }

       if(index >= arr.length){
        return;
       }


       curr.add(arr[index]);

       findCombination(arr, index+1 ,target, curr, ans);

       curr.remove(curr.size()-1);
     
    findCombination(arr, index+1, target, curr, ans);
}
}