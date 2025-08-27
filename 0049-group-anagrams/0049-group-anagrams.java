class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
          String s = strs[i];
          char [] ch = s.toCharArray();
          Arrays.sort(ch);
          String sortedString = new String(ch);

          if(map.containsKey(sortedString)){
            list.get(map.get(sortedString)).add(s);
          }else {
            List<String> l = new ArrayList<>();
            l.add(s);
            list.add(l);
            map.put(sortedString,list.size()-1);
          }
        }

        return list;


    }
}