// Last updated: 20/09/2026, 14:24:56
class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ans+=((26-((int)(ch)-96)+1)*(i+1));
            System.out.println(ans);
        }
        return ans;
    }
}