// Last updated: 22/09/2026, 18:24:45
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            min  = Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }
        for (int i = 0; i < n-1; i++) {
            if(Math.abs(arr[i]-arr[i+1])==min) {
                List<Integer> a = new ArrayList<>();
                a.add(arr[i]);
                a.add(arr[i+1]);
                ans.add(a);
            }
        }
        return ans;
    }
}