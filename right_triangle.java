package java_dsa;

import java.util.Scanner;

public class right_triangle {
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number_1=scanner.nextInt();
        for(int row=0;row<number_1;row++)
        {
            for(int col=0;col<=row;col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
