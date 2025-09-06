class Solution {
    public int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int [][] dp = new int [n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                dp[i][j] = -1;
            }
        }
        
        int ans = findMin(grid,n, m, 0, 0, dp);

        return ans;
    }

    public static int findMin(int [][] arr, int n, int m , int i, int j, int [][] dp){

        // if(i >= n || j >= m){
        //     return Integer.MAX_VALUE;
        // }

        // if(i == n-1 && j == m-1){
        //     return sum+arr[i][j];
        // }

        // if

        // int right = findMin(arr, n, m, i+1, j, sum + arr[i][j]);
        // int down = findMin(arr, n, m , i, j+1, sum+arr[i][j]);

        // return Math.min(right, down);

        if(i >= n || j >= m){
           return Integer.MAX_VALUE;
        }

        if(i == n-1 && j == m-1){
            return arr[i][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }


        int right = findMin(arr, n, m, i+1, j, dp);
        int down = findMin(arr, n, m , i, j+1, dp);

        return dp [i][j] = arr[i][j] + Math.min(right, down);


    }
}