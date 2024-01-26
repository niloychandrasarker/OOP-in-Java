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
            }
        }
        printf("\n");
    }

    // Loop for G
    for (row = 1; row <= n; row++) {
        space = n * 5;
        for (col = 1; col <= space; col++)
            printf(" ");
        star = n;
        for (col = 1; col <= star; col++) {
            if ((row == 1 || row == n) ||
                (row > n / 2 && col == 1) ||
                (row < n / 2 && col == n) ||
                (row == n / 2 && col >= n / 2) ||
                (row > n / 2 && col == n && row != n))
            {
                printf("*");
                Sleep(70);
            } else {
                printf(" ");
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
                (row > 1 && row < n && col == n))
            {
                printf("*");
                Sleep(70);
            } else {
                printf(" ");
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
            }
        }
        printf("\n");
    }

    // Loop for A
    for (row = 1; row <= n; row++) {
        space = n * 8;
        for (col = 1; col <= space; col++)
            printf(" ");
        star = n;
        for (col = 1; col <= star; col++) {
            if ((row == 1 || row == n / 2 + 1 || row == n) ||
                (col == 1 && row != 1 && row != n / 2 + 1 && row != n) ||
                (col == n && row != 1 && row != n / 2 + 1 && row != n) ||
                (row <= n / 2 && col == row + 1) ||
                (row <= n / 2 && col == n - row))
            {
                printf("*");
                Sleep(70);
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }

    getch();
    return 0;
}
