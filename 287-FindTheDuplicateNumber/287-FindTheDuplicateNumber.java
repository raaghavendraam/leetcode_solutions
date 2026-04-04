// Last updated: 04/04/2026, 15:46:09
class Solution {
    public void swap(int[] a ,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public int findDuplicate(int[] a) {
        while (true) {
            if(a[0]==a[a[0]]) return a[0];
            swap(a, 0, a[0]);
        }
    }
}