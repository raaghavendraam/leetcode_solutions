// Last updated: 04/04/2026, 15:46:34
bool isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}