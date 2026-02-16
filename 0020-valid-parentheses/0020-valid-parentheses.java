class Solution {
    public boolean isValid(String s) {


      if(s.length() == 0) return true;

      if(s.length() == 1)  return false;



        boolean ans = check(s);

        return ans;
    }
    
    public static boolean check(String s){
        Stack <Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else{
                if (st.isEmpty()) return false;

                if(!st.isEmpty() && ch == '}' && st.peek() != '{') return false;
                if(!st.isEmpty() && ch == ')' && st.peek() != '(') return false;
                if(!st.isEmpty() && ch == ']' && st.peek() != '[') return false;

                st.pop();
            }
        }

        return st.isEmpty();
    }
}