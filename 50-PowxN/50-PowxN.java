// Last updated: 04/04/2026, 15:47:51
class Solution {
    public double power(double a,long b){
        if(b==1) return a;
        if(b==0) return 1;
        double ans = power(a, b/2);
        if(b%2==0) return ans*ans;
        return ans*ans*a;
    }
    public double myPow(double x, int n) {
        long b = n;  
        if(b < 0){
            x = 1 / x;
            b = -b;
        }
        return power(x,b);
    }
}