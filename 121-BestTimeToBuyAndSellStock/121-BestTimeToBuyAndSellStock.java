// Last updated: 25/11/2026, 12:05:14
class Solution {
    public int maxProfit(int[] a) {
        int buy =  Integer.MIN_VALUE;
        int sell = 0;
        for(int p:a){
            buy = Math.max(buy,-p);
            sell = Math.max(sell,buy+p);
        }
        return sell;
    }
}