// Last updated: 04/04/2026, 15:46:35
#define STACK_SIZE 1000
int calculate(char* s) {
    int stack[STACK_SIZE];
    int top = -1;
    int result = 0;
    int sign = 1;
    int num = 0;

    for (int i = 0; s[i] != '\0'; i++) {
        char ch = s[i];

        if (isdigit(ch)) {
            num = num * 10 + (ch - '0');
        } else if (ch == '+') {
            result += sign * num;
            sign = 1;
            num = 0;
        } else if (ch == '-') {
            result += sign * num;
            sign = -1;
            num = 0;
        } else if (ch == '(') {
            // Push current result and sign
            stack[++top] = result;
            stack[++top] = sign;
            // Reset for inner expression
            result = 0;
            sign = 1;
        } else if (ch == ')') {
            result += sign * num;
            num = 0;
            // Pop sign and result
            int prev_sign = stack[top--];
            int prev_result = stack[top--];
            result = prev_result + prev_sign * result;
        }
        // Ignore spaces
    }
    result += sign * num;
    return result;}