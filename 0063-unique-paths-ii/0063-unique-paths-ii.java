class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int [][] dp = new int [m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }

        int ans = findMax(obstacleGrid, 0, 0, m , n, dp);

        return ans;
    }

    public static int findMax(int [][] arr, int i, int j, int m , int n, int [][] dp){

        if(i >= m || j >= n){
            return 0;
        }


        if(arr[i][j] == 1){
            return 0;
        }

        if(i == m-1 && j == n-1){
            return 1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int down = findMax(arr, i+1, j, m, n, dp);
        int right = findMax(arr, i, j+1, m, n, dp);

        dp[i][j] = down + right;  
        return dp[i][j];

    }
}