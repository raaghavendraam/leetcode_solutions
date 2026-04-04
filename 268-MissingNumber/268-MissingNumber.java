// Last updated: 04/04/2026, 15:46:13
class Solution {

    public void swap(int[] a ,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public int missingNumber(int[] a) {
        int n = a.length;
        int i = 0;
        while (i<n) {
            if(a[i]!=n&&a[i]!=i) swap(a,a[i],i);
            else i++;
        }
        for (int j = 0; j < a.length; j++) {
            if(a[j]!=j) return j;
        }
        return n;
    }
}