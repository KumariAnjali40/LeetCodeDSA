class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        // List<List<Integer>> result = new ArrayList<>();

        // subset(nums,0,new ArrayList<>(),result);

        // return result;

        Set<ArrayList<Integer>> set = new HashSet<>();

        subset(nums, 0, set, new ArrayList<>());

        return new ArrayList<>(set);
    }

    public static void subset(int [] arr,int index, Set<ArrayList<Integer>>ans, ArrayList<Integer>curr){
        if(index >= arr.length){
            ans.add(new ArrayList<>(curr));

            return;
        }

        curr.add(arr[index]);
        subset(arr, index+1,ans, curr);

        curr.remove(curr.size()-1);

        subset(arr, index+1, ans, curr);
    }

    // public static void subset(int [] arr, int currIndex, ArrayList<Integer> current, List<List<Integer>> result ){
    //        if(currIndex >= arr.length){
    //         result.add(new ArrayList<>(current));
    //         return;
    //        }

    //        current.add(arr[currIndex]);
    //        subset(arr,currIndex+1,current,result);

    //        current.remove(current.size()-1);

    //        int nextIndex = currIndex+1;

    //        while(nextIndex < arr.length && arr[currIndex] == arr[nextIndex]){
    //         nextIndex++;
    //        }

    //        subset(arr,nextIndex,current,result);

    // }
}