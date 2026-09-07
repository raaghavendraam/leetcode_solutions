// Last updated: 07/09/2026, 08:44:20
class Solution {
    public String reverse(String s){
        StringBuilder a = new StringBuilder(""+s);
        return a.reverse().toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int c=0;
        for (int i = 0; i < words.length; i++) {
            if(set.contains(reverse(words[i]))){
                c++;
            }
            else set.add(words[i]);
        }
        return c;
    }
}