// Last updated: 04/04/2026, 15:44:27
class Solution {
     public int bestClosingTime(String s) {
        int n = s.length();
        int min = Integer.MAX_VALUE;
        int[] pre = new int[n+1];
        int[] suf = new int[n+1];
        for (int i = 0; i <n; i++) {
            int add =0;
            if(s.charAt(i)=='N') add=1;
            pre[i+1] =add+pre[i];
        }
        for (int i = n-1; i >=0; i--) {
            int add =0;
            if(s.charAt(i)=='Y') add=1;
            suf[i] =suf[i+1]+add;
            min = Math.min(min,suf[i]+pre[i]);
        }
            min = Math.min(min,suf[n] + pre[n]);
        for (int i = 0; i <=n; i++) {
            if(min == suf[i]+pre[i]) return i;
        }
        return -1;
    }
}