// Last updated: 04/04/2026, 15:45:03
char* longestDiverseString(int a, int b, int c) {
    // Max possible length is a + b + c
    int maxLen = a + b + c;
    char* result = (char*)malloc(maxLen + 1);
    int idx = 0;

    // Struct to hold letter and count
    struct Letter {
        char ch;
        int count;
    } letters[3] = {{'a', a}, {'b', b}, {'c', c}};

    while (1) {
        // Sort letters by count descending
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (letters[j].count > letters[i].count) {
                    struct Letter temp = letters[i];
                    letters[i] = letters[j];
                    letters[j] = temp;
                }
            }
        }

        if (letters[0].count == 0) break;

        // Check if last two characters are same as letters[0].ch
        int len = idx;
        if (len >= 2 && result[len - 1] == letters[0].ch && result[len - 2] == letters[0].ch) {
            // Try to use second letter
            if (letters[1].count == 0) break;

            result[idx++] = letters[1].ch;
            letters[1].count--;
        } else {
            // Use the letter with highest count
            result[idx++] = letters[0].ch;
            letters[0].count--;
        }
    }

    result[idx] = '\0';
    return result;
}