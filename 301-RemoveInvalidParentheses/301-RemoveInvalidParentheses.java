// Last updated: 11/10/2026, 12:23:01
class Solution {
    Set<String> ans = new HashSet<>();
    int minRemove = Integer.MAX_VALUE;

    public void help(int open, int close, int i, String st, String s, int remove) {

        // End of string
        if (i == st.length()) {
            if (open == close) {
                if (remove < minRemove) {
                    minRemove = remove;
                    ans.clear();
                    ans.add(s);
                } 
                else if (remove == minRemove) {
                    ans.add(s);
                }
            }
            return;
        }

        char ch = st.charAt(i);

        // Normal character - cannot remove
        if (ch != '(' && ch != ')') {
            help(open, close, i + 1, st, s + ch, remove);
        }

        else {
            // Option 1: Remove this parenthesis
            help(open, close, i + 1, st, s, remove + 1);

            // Option 2: Keep this parenthesis
            if (ch == '(') {
                help(open + 1, close, i + 1, st, s + '(', remove);
            }

            else if (open > close) {
                help(open, close + 1, i + 1, st, s + ')', remove);
            }
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        help(0, 0, 0, s, "", 0);
        return new ArrayList<>(ans);
    }
}