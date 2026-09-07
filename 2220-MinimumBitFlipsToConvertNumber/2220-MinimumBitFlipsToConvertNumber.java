// Last updated: 07/09/2026, 08:44:38
class Solution {
    public int minBitFlips(int a, int b) {
        int n = a^b;
        int count =0;
        while (n!=0) {
            n = n&(n-1);
            count++;
        }
        return count;
    }
}