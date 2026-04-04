// Last updated: 04/04/2026, 15:44:38
int totalMoney(int n) {
    int full_weeks = n / 7;
    int remaining_days = n % 7;

    // Total amount for complete weeks
    int total_full_weeks = 28 * full_weeks + 7 * (full_weeks * (full_weeks - 1)) / 2;

    // Total amount for remaining days
    int total_remaining_days = (full_weeks + 1) * remaining_days + remaining_days * (remaining_days - 1) / 2;

    return total_full_weeks + total_remaining_days;
}