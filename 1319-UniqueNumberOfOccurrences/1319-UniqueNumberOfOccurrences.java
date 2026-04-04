// Last updated: 04/04/2026, 15:45:02
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,((map.get(ele))+1));
            }
            else map.put(ele,1);
        }
        HashSet<Integer> set= new HashSet<>();
        for(int ele:map.values()){
            set.add(ele);
        }
        return map.size()==set.size();
    }
}