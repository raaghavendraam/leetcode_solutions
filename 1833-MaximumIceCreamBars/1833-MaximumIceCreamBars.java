// Last updated: 07/09/2026, 08:45:10
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