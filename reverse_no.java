package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_no {
    public static int reverse(int num)
    {  int x=num;
        int rem,div,rev=0;
        while (x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        return rev;

    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();

        System.out.println(reverse(number));

    }
}
