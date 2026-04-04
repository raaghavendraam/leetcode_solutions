// Last updated: 04/04/2026, 15:46:23
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Long> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map1.containsKey(ch)) map1.put(ch, map1.get(ch)+1);
            else  map1.put(ch,(long)1);
        }
        HashMap<Character,Long> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(map2.containsKey(ch)) map2.put(ch,(map2.get(ch))+1);
            else  map2.put(ch,(long)1);
        }
        for (char map: map1.keySet()) {
            if(!map2.containsKey(map)) return false;
            if(!map1.get(map).equals(map2.get(map))) return false;
        }
        return true;
    }
}