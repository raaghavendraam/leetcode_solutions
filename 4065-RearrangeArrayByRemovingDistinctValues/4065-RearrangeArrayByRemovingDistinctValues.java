// Last updated: 01/10/2026, 22:41:11
class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map1 = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele:nums){
            if(map1.containsKey(ele)) map1.put(ele,(map1.get(ele)+1));
            else map1.put(ele,1);
        }
        Map<Integer,Integer> map = new TreeMap<>(map1);
        while(map.size()>0){
            for(int key : new ArrayList<>(map.keySet())){
                if(map.get(key)>0){
                    ans.add(key);
                    if(map.get(key)-1==0){
                        map.remove(key);
                    }
                    else{
                        map.put(key,(map.get(key)-1));
                    }
                }
            }
        }
        int i =0;
        int[] ans2 = new int[nums.length];
        for(int ele:ans){
            ans2[i] = ele;
            i++;
        }
        return ans2;
    }
}