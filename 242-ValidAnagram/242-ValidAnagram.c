// Last updated: 04/04/2026, 15:46:18
#include <stdbool.h>
#include <string.h>

bool isAnagram(char* s, char* t) {
    int freq[26] = {0};

    // If lengths differ, cannot be anagrams
    if (strlen(s) != strlen(t))
        return false;

    // Count characters in s
    for (int i = 0; s[i] != '\0'; i++) {
        freq[s[i] - 'a']++;
    }

    // Subtract characters using t
    for (int i = 0; t[i] != '\0'; i++) {
        freq[t[i] - 'a']--;
        if (freq[t[i] - 'a'] < 0)
            return false;
    }

    return true;
}
