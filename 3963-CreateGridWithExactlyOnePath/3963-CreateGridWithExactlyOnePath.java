// Last updated: 29/10/2026, 21:44:19
class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        String s  = "",s2 = "";
        for (int i = 0; i < n; i++) {
            if(i!=n-1) s2+='#';
            else if(i==n-1) s2 +=".";
            s+=".";
        }
        ans[0] = s;
        for (int i = 1; i < m; i++) {
            ans[i] = s2;
        }
        return ans;
    }
}