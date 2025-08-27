class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            m1.put(ch, m1.getOrDefault(ch, 0)+1);
        }

         for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            m2.put(ch, m2.getOrDefault(ch, 0)+1);
        }

        return m1.equals(m2);
    }
}