class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.equals(text2)) return text1.length();

        if(text1.length() == 0 || text2.length() ==0) return 0;

        // int ans = solve(text1, text2, 0, 0);

        // return ans;

        int n = text1.length();
        int m = text2.length();

        int [][] memo = new int [n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                memo[i][j] = -1;
            }
        }

        int ans = solve(text1, text2, 0, 0, memo);

        return ans;
    }

    public static int solve(String text1, String text2, int i , int j, int [][] memo){
          
        //   if(i >= text1.length() || j >= text2.length()) return 0;


        //   if(text1.charAt(i) == text2.charAt(j)){
        //     return 1 + solve(text1, text2, i+1, j+1);
        //   } 

        //   return Math.max(solve(text1, text2, i+1, j),solve(text1, text2, i, j+1));

        if(i >= text1.length() || j >= text2.length()) return 0;

        if(memo[i][j] != -1) return memo[i][j];


          if(text1.charAt(i) == text2.charAt(j)){
            memo[i][j] = 1 + solve(text1, text2, i+1, j+1, memo);
          } else {
             memo[i][j]= Math.max(solve(text1, text2, i+1, j, memo),solve(text1, text2, i, j+1, memo));
          }

          return memo[i][j];
    }
}