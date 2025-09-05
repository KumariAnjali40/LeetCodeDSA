class Solution {
    public int uniquePaths(int m, int n) {
      
      int [][] grid = new int [m][n];

      for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            grid[i][j] = -1;
        }
      }

        int ans = findPaths(m, n, 0, 0, grid);

        return ans;
    }

    public static int findPaths(int m, int n, int i, int j, int [][] arr){
   
       if(i >= m || j >= n){
         return 0;
       }

       if(i == m-1 && j == n-1){
         return 1;
       }

       // either right


       if(arr[i][j] != -1){
        return arr[i][j];
       }

       int down = findPaths(m, n, i+1, j, arr);
       int right = findPaths(m, n , i, j+1, arr);

       return arr[i][j] = down+right;

       // either down
      
    }
}