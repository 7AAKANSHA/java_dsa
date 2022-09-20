package java_dsa;

import java.util.Scanner;

public class pyramidstar {
    public static void pyramid(int n) {
        int k=0;
        for (int i = 1; i <= n; ++i, k = 0) {
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }

    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        pyramid(number);
        //System.out.println(res);
    }
}
