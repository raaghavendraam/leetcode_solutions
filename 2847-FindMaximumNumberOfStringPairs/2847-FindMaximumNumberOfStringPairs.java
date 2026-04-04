// Last updated: 04/04/2026, 15:44:25
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
       HashSet<String> set = new HashSet<>();
       int count =0;
       for(int i =0;i<words.length;i++){
        if(set.contains(reverse(words[i]))){
            count++;
        }
        else
            set.add(words[i]);
       }
       return count;
    }
    public String reverse(String n){
        StringBuilder st = new StringBuilder(n);
        st.reverse();
        return st.toString();
    }
}