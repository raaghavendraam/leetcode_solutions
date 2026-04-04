// Last updated: 04/04/2026, 15:45:10
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