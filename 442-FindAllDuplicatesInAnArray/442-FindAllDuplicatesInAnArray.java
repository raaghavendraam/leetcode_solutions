// Last updated: 04/04/2026, 15:45:55
class Solution {
    public void swap(int[] a ,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public List<Integer> findDuplicates(int[] a) {
        List<Integer> ans = new ArrayList<>();
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
            if(a[j]!=j+1) ans.add(a[j]);
        }
        return ans;
    }
}