// Last updated: 04/04/2026, 15:46:51
class Solution {
    public int reverseBits(int n) {
        int i = 0,j=31;
        while (i<j) {
            int iMask = 1<<i ,jMask = 1<<j;
            boolean i1 = (n&iMask)!=0,j1 = (n&jMask)!=0;
            if(i1!=j1){
                n ^= iMask;
                n ^= jMask;
            }
            i++;
            j--;
        }
        return n;
    }
}