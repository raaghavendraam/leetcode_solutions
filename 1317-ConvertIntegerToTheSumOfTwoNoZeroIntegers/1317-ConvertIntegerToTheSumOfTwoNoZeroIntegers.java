// Last updated: 07/09/2026, 08:46:00
class Solution {
    public boolean contains(int n){
        while(n>0){
            if(n%10==0) return true;
            n/=10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for(int i =1;i<n;i++)
        {int a =i;
        int b = n-i;
        if(!contains(a)&&!contains(b)){
            ans[0]=a;
            ans[1]=b;
            break;
        }}
        return ans;
    }
}