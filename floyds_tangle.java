package java_dsa;

import java.util.Scanner;

public class floyds_tangle {

    public static void floyds_trio(int n)
    {
        int x=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print( x+" " );
                x++;
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

       floyds_trio(number);
        //System.out.println(res);
    }
}
