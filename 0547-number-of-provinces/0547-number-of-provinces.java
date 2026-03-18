class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        
        boolean [] visited = new boolean[n];

        int province = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i, isConnected, visited);
                province++;
            }
        }

        return province;
    }

    public static void dfs(int city, int [][] arr, boolean [] visited){

        visited[city] = true;

        for(int j = 0; j < arr.length; j++){
            if(arr[city][j] == 1 && !visited[j]){
                dfs(j, arr, visited);
            }
        }
    }
}