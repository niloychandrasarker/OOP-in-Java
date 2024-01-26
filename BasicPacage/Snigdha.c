#include <stdio.h>
#include <windows.h>
#include <conio.h>

int main() {
    int star, col, row, space, n = 10;

    // Loop for S
    for (row = 1; row <= n; row++) {
        space = n * 2;
        for (col = 1; col <= space; col++)
            printf(" ");
        star = n;
        for (col = 1; col <= star; col++) {
            if ((row == 1 || row == n || row == n / 2) ||
                (row < n / 2 && col == 1) ||
                (row > n / 2 && col == n))
            {
                printf("*");
                Sleep(70);
            } else {
                printf(" ");
                Sleep(70);
            }
        }
        printf("\n");
    }

    // Loop for N
    for (row = 1; row <= n; row++) {
        space = n * 3;
        for (col = 1; col <= space; col++)
            printf(" ");
        star = n;
        for (col = 1; col <= star; col++) {
            if (col == 1 || col == n || col == row)
            {
                printf("*");
                Sleep(70);
            } else {
                printf(" ");
                Sleep(70);
            }
        }
        printf("\n");
    }

    // Loop for I
    for (row = 1; row <= n; row++) {
        space = n * 4;
        for (col = 1; col <= space; col++)
            printf(" ");
        star = n;
        for (col = 1; col <= star; col++) {
            if (col == n / 2 + 1 || row == 1 || row == n)
            {
                printf("*");
                Sleep(70);
            } else {
                printf(" ");
                Sleep(70);
            }
        }
        printf("\n");
    }

    // Loop for G
    for (row = 0; row < 8; row++) {
        space = n * 5;
        for (col = 1; col <= space; col++)
            printf(" ");
        for (col = 0; col < 8; col++) {
            if ((row == 0 && (col != 0 && col != 7)) ||
                (row == 7 && (col != 0 && col != 7)) ||
                (col == 0 && (row != 0 && row != 7)) ||
                (col == 7 && row != 7 && row >= 3) ||
                (row == 3 && (3 <= col && col < 7))) {
                printf("*");
                Sleep(70);
            } else {
                printf(" ");
                Sleep(70);
            }
        }
        printf("\n");
    }

    // Loop for D
    for (row = 1; row <= n; row++) {
    space = n * 6;
    for (col = 1; col <= space; col++)
        printf(" ");
    star = n;
    for (col = 1; col <= star; col++) {
        if ((col == 1 || col == n) ||
            (row == 1 || row == n) ||
            (row > 1 && row < n && col == 2))
        {
            printf("*");
            Sleep(70);
        } else {
            printf(" ");
            Sleep(70);
        }
    }
    printf("\n");
}

    // Loop for H
    for (row = 1; row <= n; row++) {
        space = n * 7;
        for (col = 1; col <= space; col++)
            printf(" ");
        star = n;
        for (col = 1; col <= star; col++) {
            if (col == 1 || col == n || row == n / 2 + 1)
            {
                printf("*");
                Sleep(70);
            } else {
                printf(" ");
                Sleep(70);
            }
        }
        printf("\n");
    }

    // Loop for A
    for (row = 0; row < 10; row++) {
        space = n * 8;  // Adjusted space for "A"
        for (col = 0; col < space; col++)
            printf(" ");
        star = n + 2 * row - 2; // Adjusted star count for "A"
        for (col = 0; col < 10; col++) {
            if ((col == 0 || col == 8) && (row != 0) || ((row == 0 || row == 4) && (col > 0 && col < 8)))
            {
                printf("*");
                Sleep(70);
            }
            else {
                printf(" ");
                Sleep(70);
            }
        }
        printf("\n");
    }

    // Additional decoration
    printf("\n\n\t\t\t\t\t\t\t\t\t\t   -- Happy Coding --");

    getch();
    return 0;
}
