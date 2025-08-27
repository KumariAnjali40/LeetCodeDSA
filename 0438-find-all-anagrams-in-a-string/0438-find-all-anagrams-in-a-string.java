class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> pMap = new HashMap<>();

        int n = s.length();
        int m = p.length();
        
        for(int i = 0; i < m; i++){
            char ch = p.charAt(i);
            pMap.put(ch, pMap.getOrDefault(ch,0)+1);
        }

        HashMap<Character, Integer> sMap = new HashMap<>();

        int left = 0; 
        int right = 0;
        int count = 0;

        List<Integer> list = new ArrayList<>();

        while(right < n){
           char ch = s.charAt(right);
           if(sMap.containsKey(ch)){
             sMap.put(ch, sMap.get(ch)+1);
           }else {
            sMap.put(ch,1);
           }

           if(right - left + 1 < m){
              right++;
           } else if(right - left + 1 == m){
              if(sMap.equals(pMap)){
                list.add(left);
              }


              char leftChar = s.charAt(left);

              sMap.put(leftChar, sMap.get(leftChar)-1);

              if(sMap.get(leftChar) == 0){
                sMap.remove(leftChar);
              }

              left++;
              right++;
           }
        }

        return list;
    }
}