// Last updated: 04/04/2026, 15:46:30
int calculate(char* s) {
    int current = 0, last = 0, result = 0;
    char op = '+';
    int i = 0;
    int n = strlen(s);

    while (i <= n) {
        char ch = s[i];
        
        if (isdigit(ch)) {
            current = current * 10 + (ch - '0');
        }

        if ((!isdigit(ch) && !isspace(ch)) || i == n) {
            if (op == '+') {
                result += last;
                last = current;
            } else if (op == '-') {
                result += last;
                last = -current;
            } else if (op == '*') {
                last = last * current;
            } else if (op == '/') {
                last = last / current; // truncates toward zero in C
            }
            op = ch;
            current = 0;
        }
        i++;
    }

    result += last;
    return result;

}