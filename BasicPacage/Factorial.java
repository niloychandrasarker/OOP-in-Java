package BasicPackage;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 1;

        while (n != 0) {
            result *= n;
            n--;
        }

        System.out.println(result);
        sc.close();
    }
}
