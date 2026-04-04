// Last updated: 04/04/2026, 15:48:14
class Solution {
    public  int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=0;
        HashMap<Character,Integer> map = new HashMap<>();
       while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)&& map.get(ch)>=i){
                int len = j-i;
                max = Math.max(max, len);
                while (s.charAt(i)!=s.charAt(j)) i++;
                i++;
            }
            map.put(ch,j);
            j++;
        }
        int len = j-i;
        max = Math.max(max, len);
        return max;  
    }
}