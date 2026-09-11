// Last updated: 11/09/2026, 16:19:40
class Solution {
    public long countCommas(long n) {
        long count =0;
        long start = 1000;
        long comma = 1;
        while (start<=n) {
            long end = start*1000-1;
            if(n<end) end =n;
            count+=(end - start+1)*comma;
            start = start*1000;
            comma++;
        }
        return count;
    }
}