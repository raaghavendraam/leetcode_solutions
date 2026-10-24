// Last updated: 25/10/2026, 01:08:55
class Solution {
     public int minOperations(String s) {
        int n = s.length()-1;
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        if(s.equals(new String(arr))) return 0;
        if(n<2) return -1;
        int min  = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            min = Math.min(min, ch);
            max = Math.max(max, ch);
        }
        char min_ = (char)min;
        char max_ = (char)max;
        min  = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for (int i = 1; i < s.length()-1; i++) {
            int ch = s.charAt(i);
            min = Math.min(min, ch);
            max = Math.max(max, ch);
        }
        char min_mid = (char)min;
        char max_mid = (char)max;
        if(min_==s.charAt(0)||max_== s.charAt(n)) return 1;
        if(s.charAt(0)>max_mid&&min_mid>s.charAt(n)) return 3;
        return 2;
    }
}