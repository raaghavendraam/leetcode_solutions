// Last updated: 04/04/2026, 15:48:07
class Solution {
    public boolean isValid(String str) {
        Stack<Character> a = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(') a.push(ch);
            else if(ch == '[') a.push(ch);
            else if(ch == '{') a.push(ch);
            else 
            {
                if(a.isEmpty()) return false;
                if(ch==')'&& a.peek()=='(')  a.pop();
                else if(ch==']'&& a.peek()=='[')  a.pop();
                else if(ch=='}'&& a.peek()=='{')  a.pop();
                else return false;
            }
        
        }
        if(a.size()==0) return true;
         return false;
    }
}