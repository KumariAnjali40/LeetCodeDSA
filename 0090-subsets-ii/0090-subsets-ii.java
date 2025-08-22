class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        subset(nums,0,new ArrayList<>(),result);

        return result;
    }

    public static void subset(int [] arr, int currIndex, ArrayList<Integer> current, List<List<Integer>> result ){
           if(currIndex >= arr.length){
            result.add(new ArrayList<>(current));
            return;
           }

           current.add(arr[currIndex]);
           subset(arr,currIndex+1,current,result);

           current.remove(current.size()-1);

           int nextIndex = currIndex+1;

           while(nextIndex < arr.length && arr[currIndex] == arr[nextIndex]){
            nextIndex++;
           }

           subset(arr,nextIndex,current,result);

    }
}