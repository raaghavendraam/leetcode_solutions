// Last updated: 07/09/2026, 08:42:38
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i <n; i++) {
            int sum =0;
            for (int j = 0; j < words[i].length(); j++) {
                int ch = words[i].charAt(j)-97;
                sum+= weights[ch];
            }
            sum = sum%26;
            s.append((char)(122-sum));
        }
        return s.toString();
    }
}