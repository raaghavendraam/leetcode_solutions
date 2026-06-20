// Last updated: 20/06/2026, 22:07:20
class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i <n; i++) {
            char ch = s.charAt(i);
            if((int)(ch)<=122&&(int)(ch)>=97){
                ans.append(ch);
            }
            else if(ch=='%'){
                ans.reverse();
            }
            else if(ch=='#'){
                ans.append(new StringBuilder(ans));
            }
            else{
                if(ans.length()>0){
                    ans.deleteCharAt(ans.length()-1);
                }
            }
            // System.out.println(ans);
        }
        return ans.toString();
    }
}