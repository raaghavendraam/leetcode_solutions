// Last updated: 25/11/2026, 12:05:06

class Solution {
    public int maxProfit(int[] a) {
        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;

        for (int p : a) {
            buy1 = Math.max(buy1, -p);
            sell1 = Math.max(sell1, buy1 + p);

            buy2 = Math.max(buy2, sell1 - p);
            sell2 = Math.max(sell2, buy2 + p);
        }

        return sell2;
    }
}
