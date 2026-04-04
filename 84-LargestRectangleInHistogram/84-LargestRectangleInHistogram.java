// Last updated: 04/04/2026, 15:47:30
class Solution {
    public int largestRectangleArea(int[] a) {
        int[] nse = new int[a.length];
        int[] pse = new int[a.length];
        Stack<Integer> s = new Stack<>();
        int n= a.length;
        nse[n-1] = n;
        s.push(n-1);
        for (int i = n-2; i>=0; i--) {
            while (s.size()>0&&a[i]<=a[s.peek()]) s.pop();
            if(s.size()==0) nse[i]=n;
            else nse[i]=s.peek();
            s.push(i);
        }
        while(s.size()>0) s.pop();
        pse[0]= -1;
        s.push(0);
        for (int i = 1; i < a.length; i++) {
            while(s.size()>0&& a[i] <=a[s.peek()]) s.pop();
            if(s.size()==0) pse[i]=-1;
            else pse[i]=s.peek();
            s.push(i);
        }
        int max =-1;
        for(int i=0;i<n;i++){
            max =Math.max(max,(a[i]*(nse[i]-pse[i]-1)));
        }
        return max;
    }
}