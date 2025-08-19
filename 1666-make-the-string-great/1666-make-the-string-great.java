class Solution {
    public String makeGood(String s) {
        Stack <Character> st = new Stack<>();
       
       int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(i == 0){
                st.push(ch);
                i++;
            } else {
                if(!st.isEmpty() && Math.abs(st.peek()-ch) == 32 ){
                    st.pop();
                    i++;
                }else {
                    st.push(ch);
                    i++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();


    }
}