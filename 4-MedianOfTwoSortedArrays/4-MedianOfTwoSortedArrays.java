// Last updated: 04/04/2026, 15:48:13
import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] a1, int[] a2) {
        int n1 =a1.length;
        int n2 = a2.length;
        int r = n1;
        double median =0.0;
         int[] c= new int[n1+n2];
        for (int i = 0; i < n1; i++) {
            c[i]=a1[i];
        }
        for (int i = 0; i < n2; i++) {
            c[r]=a2[i];
            r++;
        }
        Arrays.sort(c);
        if (c.length%2==1) {
            median =c[((c.length+1)/2)-1];
        } else {
            median = ((c[(c.length/2)-1])+(c[((c.length/2)+1)-1]))/2.0;
        }
        return median;
    }
}