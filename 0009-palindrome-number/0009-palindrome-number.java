class Solution {
    public boolean isPalindrome(int x) {
        int n = x;

        int ans = 0;
        while(n > 0){
    
            int temp = n % 10;

            ans = (ans * 10) + temp;

            n = n / 10;
        }

        return x == ans;
    }
}