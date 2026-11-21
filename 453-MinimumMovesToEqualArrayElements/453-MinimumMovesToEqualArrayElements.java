// Last updated: 21/11/2026, 14:38:57
class Solution {
    public int minMoves(int[] a) {
        int max = 0,min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min,a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            max += a[i]-min;
        }
        return max;
    }
}