class Solution {
    public boolean canPartitionKSubsets(int[] arr, int k) {
        
         int n = arr.length;
        
        int totalSum = 0;
        
        for(int i = 0; i < n; i++){
            totalSum += arr[i];
        }
        
        if(totalSum % k != 0) return false;

         Arrays.sort(arr);
        
        int newSum = totalSum / k;

        if (arr[n - 1] > newSum) return false;
    
        
         boolean[] visited = new boolean[n];
        
        boolean ans = solve(n, arr, visited, 0,newSum, 0, k);
        
        return ans;
    }

    public static boolean solve(int n, int [] arr, boolean [] visited,int index, int sum, int currSum, int k){

        if(k == 1){
            return true;
        }
        
         if(currSum == sum){
            return solve(n, arr, visited, 0, sum, 0, k-1);
         }

         if(index == n) return false;

         if(visited[index]){
            return solve(n, arr, visited, index+1, sum, currSum, k );
         }

         boolean include = false;

         if(currSum + arr[index] <= sum){
            visited[index] = true;
            
            include = solve(n, arr, visited, index+1, sum, currSum + arr[index], k);

            visited[index] = false;
         }

         boolean exclude = solve(n, arr, visited, index+1, sum, currSum, k );

         return include || exclude;


    }
}