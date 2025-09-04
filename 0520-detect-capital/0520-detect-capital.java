class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(word.equals(word.toUpperCase())){
            return true;
        }

        if(word.equals(word.toLowerCase())){
            return true;
        }

        char ch = word.charAt(0);

        if(Character.isUpperCase(ch)){
            for(int i = 1; i < word.length(); i++){
                if(!Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }

            return true;
        }

        return false;
    }
}