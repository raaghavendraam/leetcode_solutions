// Last updated: 04/04/2026, 15:44:59
int minCostToMoveChips(int* chips, int chipsSize) {
    int even_count = 0;
    int odd_count = 0;

    for (int i = 0; i < chipsSize; i++) {
        if (chips[i] % 2 == 0)
            even_count++;
        else
            odd_count++;
    }

    return (even_count < odd_count) ? even_count : odd_count;
}