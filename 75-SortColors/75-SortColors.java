// Last updated: 04/04/2026, 15:47:36
class Solution {
    public void swap(int[] a,int i ,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void sortColors(int[] a) {
        int n = a.length;
        int l = 0;
        int mid = 0;
        int h = n-1;
        while(mid<=h){
            if(a[mid]==0){
                swap(a,l,mid);
                l++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                swap(a,mid,h);
                h--;
            }
        }  
    }
}