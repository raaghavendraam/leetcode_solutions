// Last updated: 01/10/2026, 22:42:14
class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int max = Integer.MIN_VALUE;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch=='('){
                st.push('(');
            }
            else if(ch==')'){
                st.pop();
            }
            max = Math.max(max, st.size());
        }
        return max;
    }
}