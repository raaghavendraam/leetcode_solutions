// Last updated: 04/04/2026, 15:46:50
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n!=0) {
            n = n&(n-1);
            count++;
        }
        return count;
    }
}