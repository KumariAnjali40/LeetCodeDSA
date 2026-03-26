class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int max = 0;

        while (j < s.length()){

            char ch = s.charAt(j);

             while(map.containsKey(ch) && i < j){
                char ch1 = s.charAt(i);
                map.put(ch1, map.getOrDefault(ch1, 0)-1);

                if(map.get(ch1) == 0){
                    map.remove(ch1);
                }
                i++;
             }

             map.put(ch, map.getOrDefault(ch, 0)+1);

             max = Math.max(max, j-i+1);
             j++;
        }

        return max;


    }
}