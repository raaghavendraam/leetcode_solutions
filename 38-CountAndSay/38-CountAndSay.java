// Last updated: 04/04/2026, 15:47:58
class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String ans = countAndSay(n-1);
        String ans1 = new String("");
        int i=0,j=0;
        while(j<ans.length()){
            if (ans.charAt(i)==ans.charAt(j)) {
                j++;
            }
            else{
                ans1+=(j-i);
                ans1+=ans.charAt(i);
                i=j;
            }
        }ans1+=(j-i);
        ans1+=ans.charAt(i);
        return ans1;
    }
}