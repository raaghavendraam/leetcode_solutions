// Last updated: 07/09/2026, 08:46:18
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