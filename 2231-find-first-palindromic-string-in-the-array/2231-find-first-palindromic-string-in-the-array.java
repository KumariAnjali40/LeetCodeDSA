class Solution {
    public String firstPalindrome(String[] words) {

        String finalAns = "";
        
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            boolean ans = isPalindrome(word);

            if(ans){
                finalAns = word;
                break;
            }else {
                continue;
            }
        }

        return finalAns;
    }

    public static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length()-1;

        while(left < right){
            if(word.charAt(left) != word.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }
}