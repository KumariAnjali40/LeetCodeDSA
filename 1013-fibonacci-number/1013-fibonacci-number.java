class Solution {
    public int fib(int n) {
        if(n == 1){
            return 1;
        }

        if(n == 0){
            return 0;
        }

        int [] dp = new int [n+1];

        for(int i = 0; i <= n; i++){
            dp[i] = -1;
        }

        if(dp[n] != -1){
            return dp[n];
        }


       return dp[n] = fib(n-1) + fib(n-2);
    }
}