// Last updated: 07/09/2026, 08:42:54
class Solution {
    public long sumAndMultiply(int n) {
        String s = new String(""+n);
        long sum =0;
        String ans = new String("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch!='0'){
                ans+=ch;
            }
            sum+=(int)(ch)-48;
        }
        if(ans.length()==0) return 0;
        return Long.valueOf(ans)*sum;
    }
}