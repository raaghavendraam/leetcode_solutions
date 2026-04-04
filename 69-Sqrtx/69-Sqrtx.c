// Last updated: 04/04/2026, 15:47:46
int mySqrt(int x) {
      if (x == 0 || x == 1) return x;

    int left = 1, right = x / 2, ans = 0;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        // To avoid overflow, compare mid with x / mid
        if (mid <= x / mid) {
            ans = mid;         // Possible answer
            left = mid + 1;    // Try to find a bigger value
        } else {
            right = mid - 1;   // Too large, reduce the search space
        }
    }

    return ans;
}