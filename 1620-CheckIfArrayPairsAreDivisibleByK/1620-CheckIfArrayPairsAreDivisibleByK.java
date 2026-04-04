// Last updated: 04/04/2026, 15:44:45
class Solution {
    public static boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i]%k;
            if(elem<0) elem+=k;
            if(map.containsKey(elem)){
                map.put(elem,(map.get(elem)+1));
            }
            else map.put(elem,1);
        }
        if(map.containsKey(0))
        {
            if(map.get(0)%2!=0) return false;
            map.remove(0);
        }
        for (int ele : map.keySet()) {
            if(!map.containsKey(k-ele)) return false;
            else if(map.containsKey(k-ele)){
                int rem = map.get(k-ele);
                if(rem!=map.get(ele)) return false;
            }
        }
        return true;
    }
}