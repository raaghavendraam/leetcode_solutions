// Last updated: 28/08/2026, 00:14:42
class Solution {
   public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) set.add(ele);
        int i =1;
        while (true) {
            if(set.contains(k*i)) {
                i++;
            }
            else return k*i;
        }
    }
}