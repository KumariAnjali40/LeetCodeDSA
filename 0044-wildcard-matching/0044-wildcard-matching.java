class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length() + 1][p.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(s, p, 0, 0, dp);
    }

    private static boolean solve(String s, String p, int i, int j, int[][] dp) {
        if (dp[i][j] != -1) return dp[i][j] == 1;

        if (i == s.length() && j == p.length()) return true;
        if (j == p.length()) return false;

        if (i == s.length()) {
            for (int k = j; k < p.length(); k++) {
                if (p.charAt(k) != '*') {
                    dp[i][j] = 0;
                    return false;
                }
            }
            dp[i][j] = 1;
            return true;
        }

        char sc = s.charAt(i);
        char pc = p.charAt(j);
        boolean ans;

        if (pc == sc || pc == '?') {
            ans = solve(s, p, i + 1, j + 1, dp);
        } else if (pc == '*') {
            ans = solve(s, p, i, j + 1, dp) || solve(s, p, i + 1, j, dp);
        } else {
            ans = false;
        }

        dp[i][j] = ans ? 1 : 0; 
        return ans;
    }
}
