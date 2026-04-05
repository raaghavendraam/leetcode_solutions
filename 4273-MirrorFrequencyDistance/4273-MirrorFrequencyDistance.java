// Last updated: 05/04/2026, 10:15:02
class Solution {
    public int mirrorFrequency(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length(),ans=0;
        int i =0;
        while (i<n) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
            i++;
        }
  
        HashSet<Character> visited = new HashSet<>();
        
        for (char ch : map.keySet()) {
            if (visited.contains(ch)) continue;
            
            char mir = help(ch);
            
            int f1 = map.getOrDefault(ch, 0);
            int f2 = map.getOrDefault(mir, 0);
            
            ans += Math.abs(f1 - f2);
            
            visited.add(ch);
            visited.add(mir);
        }
        
        return ans;
    }
    public char help(char ch){
        char ch2;
        if(Character.isDigit(ch)) ch2 = (char)(57-((int)(ch)-48));
        else ch2 = (char)(122-((int)(ch)-97));
        return ch2;
    }
}