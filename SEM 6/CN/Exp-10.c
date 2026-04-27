// Experiment - 10

// Bit Stuffing Program

#include <stdio.h>
#include <string.h>

int main() {
    char data[100], stuffed[200];
    int i, j = 0, count = 0;

    printf("Enter binary data:");
    scanf("%s", data);

    for (i = 0; i < strlen(data); i++) {
        stuffed[j] = data[i];

        if (data[i] == '1') {
            count++;
        } else {
            count = 0;
        }

        if (count == 5) {
            j++;
            stuffed[j] = '0';
            count = 0;
        }

        j++;
    }

    stuffed[j] = '\0';

    printf("Stuffed Data:%s\n", stuffed);

    return 0;
}

// Output:
// Bit stuffing :-

// enter binary data : 111101111110
// stuffed data : 11110011111010

// B. Character Stuffing
#include <stdio.h>
#include <string.h>

int main() {
    char data[100], stuffed[200];
    char flag = 'F', esc = 'E';
    int i, j = 0;

    printf("Enter data:");
    scanf("%s", data);

    stuffed[j++] = flag;
    stuffed[j++] = esc;

    stuffed[j++] = data[i];

    stuffed[j++] = flag;

    printf("Stuffed Data:%s\n", stuffed);

    return 0;
}

// Output:
// Character Stuffing :-

// enter data : AFEF
// stuffed data : FAEFEFEF