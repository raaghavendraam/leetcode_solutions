// Last updated: 07/09/2026, 08:46:52
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> temp = new Stack<>();
        for(char c:s.toCharArray()){
            if((!temp.isEmpty())&&c==temp.peek()) temp.pop();
            else
            temp.push(c);
        }
        StringBuilder ans = new StringBuilder();
        while(!temp.isEmpty())
        ans.append(temp.pop());
        return ans.reverse().toString();
    }
}