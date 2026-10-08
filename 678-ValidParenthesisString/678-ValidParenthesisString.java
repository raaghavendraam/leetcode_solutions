// Last updated: 09/10/2026, 02:08:01
class Solution {

    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='(') st.push(i);
            else if(ch=='*') st1.push(i);
            else{
                if(st.size()>0) st.pop();
                else if(st1.size()>0) st1.pop();
                else return false;
            }
        }
        while(st.size()>0&&st1.size()>0) {
            if(st.peek()<st1.peek()){
                st.pop();
                st1.pop();
            }
            else return false;
        }
        if(st.size()>0) return false;
        return true;
    }
}