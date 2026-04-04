// Last updated: 04/04/2026, 15:46:15
int addDigits(int num) {
    if (num == 0) return 0;
    return 1 + (num - 1) % 9;
}