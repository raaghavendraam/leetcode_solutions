// Last updated: 25/11/2026, 12:04:26
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) {
            if(set.contains(ele)) return true;
            else set.add(ele);
        }
        return false;
    }
}