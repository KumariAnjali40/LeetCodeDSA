class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();

        if(s.length() > 12){
            return new ArrayList<>();
        }

        solve( s, 0, new ArrayList<>(), result);

        return result;
    }

    public static void solve(String s, int index, List<String> curr, List<String> result ){
        if(curr.size() == 4){
            if(index == s.length()){
               result.add(String.join(".", curr));
            }
            return;
        }

        for(int i = 1; i <= 3; i++){
            if(index + i > s.length()) break;

            String part = s.substring(index, index+i);

            if((part.length() > 1 && part.startsWith("0")) || Integer.parseInt(part) > 255 ){
                continue;
            }

            curr.add(part);

            solve(s, index+i, curr, result);

            curr.remove(curr.size()-1);
        }
    }
}