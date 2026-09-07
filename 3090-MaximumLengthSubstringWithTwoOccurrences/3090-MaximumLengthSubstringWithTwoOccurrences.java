// Last updated: 07/09/2026, 08:43:56
class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int j =0,i=0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while (i<n&&j<n&&i<=j) {
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                if(map.get(ch)<2){
                    map.put(ch,map.get(ch)+1);
                    max = Math.max(max,j-i+1);
                    j++;
                }
                else{
                    while (map.get(ch)>=2) {
                        map.put(s.charAt(i),map.get(s.charAt(i))-1);
                        i++;
                    }
                    map.put(ch,map.get(ch)+1);
                    j++;
                }
            }
            else{
                map.put(ch, 1);
                max = Math.max(max, j - i + 1);
                j++;
            }
        }
        return max;
    }
}