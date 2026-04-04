// Last updated: 04/04/2026, 15:48:05
class Solution {
    public void helper(int open,int close,int n,List<String> ans, String a){
        if(a.length()==n*2) {
            ans.add(a);
            return;
        }
        if(open<n) helper(open+1, close, n, ans, a+"(");
        if(close<open) helper(open, close+1, n, ans, a+")");
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(0,0,n,ans,"");
        return ans;
    }
}