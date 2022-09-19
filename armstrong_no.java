package java_dsa;

import java.util.Scanner;

public class armstrong_no {
    public static boolean check_armstrongno(int num)
    {  int x=num;
        int rem,div,sum=0;
        while(num!=0)
        {
            rem=num%10;
            sum+=rem*rem*rem;
            num/=10;
        }
        if(x==sum) return  true;

        return false;
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        if(check_armstrongno(first)) System.out.println("It is a Armstrong no ");
        else System.out.println("It is not a Armstrong no ");
    }
}
