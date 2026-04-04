// Last updated: 04/04/2026, 15:44:55
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n==1) return ans;
        int mid = n/2;
        ans[0]=-1*mid;
        if(n%2!=0)
        {for(int i=1;i<n;i++){
                ans[i]=1+ans[i-1];
            }}
        else{
            for(int i=1;i<n;i++){
                if(ans[i-1]==-1) ans[i]=2+ans[i-1];
                else ans[i]=1+ans[i-1];
            }
        }
        return ans;
    }
}