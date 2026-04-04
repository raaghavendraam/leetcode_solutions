// Last updated: 04/04/2026, 15:46:00
bool isPerfectSquare(int num) {
    if (num < 1) return false;
    
    long long left = 1, right = num;

    while (left <= right) {
        long long mid = left + (right - left) / 2;
        long long square = mid * mid;

        if (square == num) return true;
        else if (square < num)
            left = mid + 1;
        else
            right = mid - 1;
    }

    return false;
}