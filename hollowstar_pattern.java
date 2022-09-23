package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class hollowstar_pattern {
    public static void hollow_star(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i == 0||i == n-1||j==0||j==n-1)
                {  System.out.print("*"); }
                  else
                {    System.out.print(" ");}

            System.out.println();
        }
    }
        public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();

        hollow_star(num);
    }
    }
