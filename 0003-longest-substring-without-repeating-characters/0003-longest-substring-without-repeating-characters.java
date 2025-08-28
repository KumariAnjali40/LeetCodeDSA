class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int max = 0;

        while(right < s.length()){

            char ch = s.charAt(right);
            
            while(map.containsKey(ch)){
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar)-1);

                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }

                left++;
            }


            map.put(ch, 1);

            max = Math.max(max, right-left+1);
            
            right++;


        }

        return max;
    }
}