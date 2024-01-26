#include <stdio.h>

int main() {
   

    for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 8; col++) {
            if ((row == 0 && (col != 0 && col != 8 - 1)) ||
                (row == 8 - 1 && (col != 0 && col != 8 - 1)) ||
                (col == 0 && (row != 0 && row != 8 - 1)) ||
                (col == 8 - 1 && row != 8 - 1 && row >= (8 / 2) - 1) ||
                (row == (8 / 2) - 1 && ((8 / 2) - 1 <= col && col < 8 - 1))) {
                printf("* ");
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }

    return 0;
}
