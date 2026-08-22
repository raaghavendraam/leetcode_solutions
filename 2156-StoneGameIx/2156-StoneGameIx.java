// Last updated: 22/08/2026, 22:24:39
class Solution {
    public boolean stoneGameIX(int[] stones) {

        int[] count = new int[3];

        for (int x : stones) {
            count[x % 3]++;
        }

        int zero = count[0];
        int one = count[1];
        int two = count[2];

        // Alice needs both types if the number of 0s is even
        if (zero % 2 == 0) {
            return one > 0 && two > 0;
        }

        // zero is odd
        return Math.abs(one - two) > 2;
    }
}