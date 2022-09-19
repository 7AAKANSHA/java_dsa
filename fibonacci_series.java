package java_dsa;

import java.util.Scanner;

public class fibonacci_series {

    public static void fibonacci(int end)
    {
        int first=0;
        int second=1;
        int third=0;
        for(int i=3;i<=end;i++)
        {
            third=first+second;
            System.out.println(third);
            first=second;
            second=third;
        }
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int upto=scanner.nextInt();

       fibonacci(upto);
    }
}
