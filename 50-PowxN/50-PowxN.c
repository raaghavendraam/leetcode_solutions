// Last updated: 04/04/2026, 15:47:54
double myPow(double x, int n) {
    long long exp = n;   // handle INT_MIN safely

    if (exp < 0) {
        x = 1 / x;
        exp = -exp;
    }

    double result = 1.0;

    while (exp > 0) {
        if (exp & 1)
            result *= x;
        x *= x;
        exp >>= 1;
    }

    return result;
}
