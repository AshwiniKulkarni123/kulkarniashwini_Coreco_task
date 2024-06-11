#include <stdio.h>
#include <string.h>

void reverseWords(char *str) {
    int i, j, start, end;
    int len = strlen(str);

    for (i = 0, j = 0; j <= len; j++) {
        if (str[j] == ' ' || str[j] == '\0') {
            start = i;
            end = j - 1;
            while (start < end) {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
            i = j + 1;
        }
    }
}

int main() {
    char str[] = "Hello World";
    reverseWords(str);
    printf("%s\n", str);
    return 0;
}

/****************OUTPUT***********

olleH dlroW
*/
