class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();

        boolean [] freq = new boolean [nums.length];

        solve(ans, curr, nums, freq);

        return ans;
    }

    public static void solve(List<List<Integer>>ans, List<Integer>curr,int [] arr, boolean [] freq){
         if(curr.size() == arr.length){
            ans.add(new ArrayList<>(curr));

            return;
         }

         for(int i = 0; i < arr.length; i++){
            if(!freq[i]) {
            freq[i] = true;
            curr.add(arr[i]);

            solve(ans, curr, arr, freq);

            curr.remove(curr.size()-1);

            freq[i] = false;
         }
         }
    }
}