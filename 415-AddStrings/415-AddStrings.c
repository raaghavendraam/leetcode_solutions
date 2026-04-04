// Last updated: 04/04/2026, 15:45:59
void reverse(char* str) {
    int i = 0, j = strlen(str) - 1;
    while(i < j) {
        char temp = str[i];
        str[i++] = str[j];
        str[j--] = temp;
    }
}
char* addStrings(char* num1, char* num2) {
        int len1 = strlen(num1), len2 = strlen(num2);
    int maxLength = len1 > len2 ? len1 : len2;

    // Allocate space for result + 1 (possible carry) + 1 for '\0'
    char* result = (char*)malloc(sizeof(char) * (maxLength + 2));
    int carry = 0, k = 0, i = len1 - 1, j = len2 - 1;

    while (i >= 0 || j >= 0 || carry > 0) {
        int digit1 = i >= 0 ? num1[i--] - '0' : 0;
        int digit2 = j >= 0 ? num2[j--] - '0' : 0;
        int sum = digit1 + digit2 + carry;
        result[k++] = (sum % 10) + '0';
        carry = sum / 10;
    }

    result[k] = '\0';
    reverse(result);
    return result;
}