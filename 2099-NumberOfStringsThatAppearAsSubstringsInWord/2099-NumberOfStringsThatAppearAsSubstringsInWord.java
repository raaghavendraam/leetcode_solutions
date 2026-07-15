// Last updated: 15/07/2026, 23:03:31
class Solution {
    public int numOfStrings(String[] patterns, String s) {
        int count =0;
        for (int i = 0; i < patterns.length; i++) {
            if(s.contains(patterns[i])) count++;
        }
        return count;
    }
}