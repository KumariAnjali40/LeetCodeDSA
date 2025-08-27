class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
  
        for(int i = 0; i < words.length; i++) {
            if(list.isEmpty() || !isAnagram(words[i], list.get(list.size()-1))){
                list.add(words[i]);
            }
        }

        return list;
        
    }

    public static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        int [] arr = new int [26];

        for(int i = 0; i < s1.length(); i++){
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) return false;
        }

        return true;
    }
}