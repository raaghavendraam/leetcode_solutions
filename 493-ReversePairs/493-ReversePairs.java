// Last updated: 04/04/2026, 15:45:52
class Solution {
    int count = 0;
    public void reverse(int[] a, int[] b)
    {
            int i =0,j=0,k=0;
            while (i<a.length&&j<b.length) {
                if ((long)a[i]>(long) ((long)2*(long)b[j])) {
                    count+= (a.length-i);
                    j++;
                }
                else i++;
            }
    }
    public  void merge(int[] a,int[] b,int[] ans)
        {
            int n = a.length;
            int m = b.length;
            int i =0,j=0,k=0;
            while (i<a.length&&j<b.length) {
                if (a[i]>(b[j])) {
                ans[k++]=b[j++];}
                else ans[k++]=a[i++];
            }
            while (i<a.length) ans[k++]=a[i++];
            while (j<b.length) ans[k++]=b[j++];
           
        }
    public  void sort(int[] arr)
        {
            int n = arr.length;
            if (n==1) return ;
            int[] a = new int[n/2];
            int[] b =new int[n-n/2];
            for (int i = 0; i < a.length; i++)  a[i]=arr[i];
            for (int i = 0; i < b.length; i++) b[i]=arr[i+n/2]; 
            sort(a);
            sort(b);
            reverse(a,b);
            merge(a, b, arr);
        }
    public int reversePairs(int[] arr) {
        sort(arr);
        return count;
     }
}