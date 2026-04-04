// Last updated: 04/04/2026, 15:44:35
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:digits){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else map.put(ele,1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=100;i<=999;i+=2){
            int x=i;
            int c =x%10;x/=10;
            int b =x%10;x/=10;
            int a =x%10;
            if(map.containsKey(a)){
                int afreq=map.get(a);
                map.put(a,afreq-1);
                if(afreq==1) map.remove(a);
                if(map.containsKey(b)){
                int bfreq=map.get(b);
                map.put(b,bfreq-1);
                if(bfreq==1) map.remove(b);
                    if(map.containsKey(c)){
                        ans.add(i);
                    }
                map.put(b,bfreq);
                }
                map.put(a,afreq);
            }
           
        }
        int[] ans2 = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ans2[i]=ans.get(i);
        }
        return ans2;
    }
}