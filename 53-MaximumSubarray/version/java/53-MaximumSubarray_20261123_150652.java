// Last updated: 23/11/2026, 15:06:52
1class Solution {
2    public int maxSubArray(int[] a) {
3        int n = a.length;
4        int max = a[0];
5        int total = a[0];
6        for (int i = 1; i <n; i++) {
7            max = Math.max(a[i], max+a[i]);
8            total = Math.max(total, max);
9            if(total<0){
10                max =0;
11            }
12        }
13        return total;
14    }
15}