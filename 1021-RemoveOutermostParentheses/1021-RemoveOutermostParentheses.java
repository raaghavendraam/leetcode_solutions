// Last updated: 09/10/2026, 02:06:37
class Solution {
    public String removeOuterParentheses(String s) {
    StringBuilder ans = new StringBuilder();
    int balance = 0;

    for (char ch : s.toCharArray()) {
        if (ch == '(') {
            if (balance > 0) {
                ans.append(ch);
            }
            balance++;
        } else {
            balance--;
            if (balance > 0) {
                ans.append(ch);
            }
        }
    }

    return ans.toString();
}
}