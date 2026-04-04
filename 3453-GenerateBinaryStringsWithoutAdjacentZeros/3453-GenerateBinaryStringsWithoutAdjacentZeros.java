// Last updated: 04/04/2026, 15:44:23
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