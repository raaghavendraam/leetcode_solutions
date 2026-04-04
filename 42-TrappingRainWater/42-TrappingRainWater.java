// Last updated: 04/04/2026, 15:47:56
class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int max=-1;
        int[] p =new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            max = Math.max(max,h[i]);
            p[i] = max;
            
        }
        int sum=0;
        max =-1;
        for (int i = n-1; i >=0; i--) {
            max = Math.max(max,h[i]);
            s[i] = max;
            s[i] = Math.min(p[i],s[i])-h[i];
            sum+=s[i];
        }
        return sum;
    }
}