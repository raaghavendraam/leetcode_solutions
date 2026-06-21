// Last updated: 22/06/2026, 01:23:28
class Solution {
public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int i = 0; i < costs.length; i++) {
            if(coins>=costs[i]) {
                count++;
                coins -= costs[i];
            }
        }
        return count;
    }
}