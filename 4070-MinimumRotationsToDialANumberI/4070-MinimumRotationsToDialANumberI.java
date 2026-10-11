// Last updated: 11/10/2026, 12:20:21
class Solution {
    public int minRotations(String s) {
        int ans = 0,n  = s.length();
        int from = 0;
        for(int i =0;i<n;i++){
            int dis = s.charAt(i)-48;
            int c = (Math.min(Math.abs(dis-from),((10-Math.abs(dis-from)))));
            ans += c;
            from = dis;
        }
        return ans;
    }
}