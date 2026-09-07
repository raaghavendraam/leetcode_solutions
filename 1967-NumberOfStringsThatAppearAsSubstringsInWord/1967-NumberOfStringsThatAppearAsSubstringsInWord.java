// Last updated: 07/09/2026, 08:45:04
class Solution {
    public int numOfStrings(String[] patterns, String s) {
        int count =0;
        for (int i = 0; i < patterns.length; i++) {
            if(s.contains(patterns[i])) count++;
        }
        return count;
    }
}