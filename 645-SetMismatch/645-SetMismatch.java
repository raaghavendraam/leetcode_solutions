// Last updated: 04/04/2026, 15:45:41
class Solution {
    public void swap(int[] a ,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public int[] findErrorNums(int[] a) {
        int[] ans = new int[2];
        int i = 0;
        int n = a.length;
        while (i<n) {
            if(a[i]==a[a[i]-1]){ 
                i++;
                continue;
            }
            if(a[i]!=i+1) swap(a, i, a[i]-1);
            else i++;
        }
        for (int j = 0; j < n; j++) {
            if(a[j]!=j+1){
                ans[0] = a[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }
}