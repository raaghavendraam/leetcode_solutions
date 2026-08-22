// Last updated: 22/08/2026, 22:24:08
class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int ele : nums) {
            q.add(ele);
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele, 1);
        }
        if(k==n) return q.peek();
        else if(k==1){
            while(q.size()>0&&map.get(q.peek())!=1){
                q.remove();
            }
            if(q.size()>0) return q.peek();
            return -1;
        }
        else{
            if(map.get(nums[0])==1&&map.get(nums[n-1])==1) return Math.max(nums[0],nums[n-1]);
           if(map.get(nums[0])>1&&map.get(nums[n-1])>1) return -1;
            if(map.get(nums[0])>1&&map.get(nums[n-1])==1) return  nums[n-1];
            if(map.get(nums[0])==1&&map.get(nums[n-1])>1) return  nums[0];
        }
        return -1;
    }
}