// Last updated: 07/09/2026, 08:43:54
class Solution {
    public void helper(List<String> ans,int n,String s){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        helper(ans, n,  s+"1");
        if(s.length()==0||s.charAt(s.length()-1)!='0') helper(ans, n,  s+"0");
    }
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,n,"");
        return ans;
    }
}