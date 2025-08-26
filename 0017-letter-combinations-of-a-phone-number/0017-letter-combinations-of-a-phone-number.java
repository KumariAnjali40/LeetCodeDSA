class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        HashMap<Character,String> map = new HashMap<>();

        if (digits == null || digits.length() == 0) return ans;

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve(ans, digits, 0, map, new StringBuilder());

        return ans;
    }

    public static void solve(List<String>ans, String digits, int index, HashMap<Character,String> map, StringBuilder current ){

        if(index == digits.length()){
            ans.add(current.toString());
            return;
        }

        char ch = digits.charAt(index);
        
         String value = map.get(ch);

        for(int i = 0; i < value.length(); i++){
            current.append(value.charAt(i));
            solve(ans, digits, index+1, map, current);
            current.deleteCharAt(current.length() - 1);

              
        }


    }
}