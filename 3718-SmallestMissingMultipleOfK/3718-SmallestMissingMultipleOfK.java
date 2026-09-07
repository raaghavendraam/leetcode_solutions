// Last updated: 07/09/2026, 08:42:58
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