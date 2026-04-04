// Last updated: 04/04/2026, 15:46:42
class Solution {
        public boolean isIsomorphic(String s, String t) {
        int n = t.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=(int)(t.charAt(i))){
                    return false;
                }
            }
            map.put(ch, (int)(t.charAt(i)));
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            if(map1.containsKey(ch)){
                if(map1.get(ch)!=(int)(s.charAt(i))){
                    return false;
                }
            }
            map1.put(ch,(int)(s.charAt(i)));
        }
        return true;
    }
}