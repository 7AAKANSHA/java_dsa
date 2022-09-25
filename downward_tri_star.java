package java_dsa;
   /*   * * * *
        * * *
        * *
        *
   */
import java.util.Scanner;

public class downward_tri_star {
    public static void downward_triangle(int n)
    {
        for(int row=n-1;row>=0;row--)
        {
            for(int col=0;col<row;col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number_1=scanner.nextInt();
        downward_triangle(number_1);
    }
}
