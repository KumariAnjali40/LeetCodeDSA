class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        for(int i = n-2; i >=0 ; i--){
            for(int j = 0; j < n; j++){
                int down = matrix[i+1][j];

                int left = (j > 0) ? matrix[i+1][j-1] : Integer.MAX_VALUE;

                int right = (j < n-1) ? matrix[i+1][j+1] : Integer.MAX_VALUE;

                matrix[i][j] += Math.min(down, Math.min(left, right));
            }
        }

        int result = Integer.MAX_VALUE;
        for (int val : matrix[0]) {
            result = Math.min(result, val);
        }

        return result;
    }
}