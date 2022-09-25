package java_dsa;

import java.util.Scanner;

public class pyramid_star {
    public static void pyramid_of_star_(int n)
    {
        for(int row=0;row<n;row++)
        {
            for(int space=n-row;space>1;space--)
            {
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number_1=scanner.nextInt();
        pyramid_of_star_(number_1);
    }
}
