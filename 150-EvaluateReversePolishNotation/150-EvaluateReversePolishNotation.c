// Last updated: 04/04/2026, 15:46:58
#define MAX_STACK 10000
int evalRPN(char** tokens, int tokensSize) {
    int stack[MAX_STACK];
    int top = -1;

    for (int i = 0; i < tokensSize; i++) {
        char* token = tokens[i];

        // If it's an operator
        if (strcmp(token, "+") == 0 || strcmp(token, "-") == 0 ||
            strcmp(token, "*") == 0 || strcmp(token, "/") == 0) {
            int b = stack[top--];
            int a = stack[top--];
            int res = 0;
            if (strcmp(token, "+") == 0) res = a + b;
            else if (strcmp(token, "-") == 0) res = a - b;
            else if (strcmp(token, "*") == 0) res = a * b;
            else if (strcmp(token, "/") == 0) res = a / b; // Truncate toward zero
            stack[++top] = res;
        } else {
            // It's a number
            stack[++top] = atoi(token);
        }
    }

    return stack[top];
}