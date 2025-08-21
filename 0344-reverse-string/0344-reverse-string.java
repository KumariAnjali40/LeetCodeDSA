class Solution {
    public void reverseString(char[] s) {
        reverseString(0, s.length-1, s);
    }

    public static void reverseString(int left, int right, char [] s){
        if(left >= right){
            return;
        }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverseString(left+1, right-1, s);
    }
}