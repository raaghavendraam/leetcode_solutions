// Last updated: 25/11/2026, 12:05:02
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder("");
        StringBuilder str1 = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if((ch>=97&&ch<=122)||(ch>=48&&ch<=57)) str.append((char)ch);
            if((ch>=97&&ch<=122)||(ch>=48&&ch<=57)) str1.append((char)ch);
        }
        if(str1.toString().equals(str.reverse().toString())) return true;
        return false;

    }
}