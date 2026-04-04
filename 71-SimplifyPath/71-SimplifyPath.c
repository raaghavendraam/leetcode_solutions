// Last updated: 04/04/2026, 15:47:39

#define MAX 1000
char* simplifyPath(char* path) {
        char* stack[MAX]; // Stack to hold valid directory names
    int top = -1;

    char* token = strtok(path, "/");
    while (token != NULL) {
        if (strcmp(token, "..") == 0) {
            if (top >= 0) top--; // Pop one level up
        } else if (strcmp(token, ".") != 0 && strlen(token) > 0) {
            stack[++top] = token; // Push valid directory
        }
        token = strtok(NULL, "/");
    }

    // If stack is empty, return "/"
    if (top == -1) return strdup("/");

    // Construct the simplified path
    char* result = (char*)malloc(MAX);
    result[0] = '\0';

    for (int i = 0; i <= top; i++) {
        strcat(result, "/");
        strcat(result, stack[i]);
    }

    return result;

}