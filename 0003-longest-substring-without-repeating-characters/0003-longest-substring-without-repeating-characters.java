class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = longestSub(s);

        return ans;
    }

    public static int longestSub(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        int max = 0;
        int i = 0;
        int j = 0;

        while(j < s.length()){
            
           char ch = s.charAt(j);

           while(map.containsKey(ch)){
             char leftChar = s.charAt(i);

             map.put(leftChar, map.get(ch)-1);


             if(map.get(leftChar) == 0){
                map.remove(leftChar);
             }
             i++;
           }

           map.put(ch, 1);

           max = Math.max(max, j - i + 1);

           j++;
        }

         return max;

    }
}