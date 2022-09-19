package java_dsa;

import java.util.Scanner;

public class strong_no {

    public static int calculate_factorial(int x)
    {  int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact*=i;
        }
        return fact;
    }

    public static  boolean check_strongno(int num)
    {
        int x=num;
        int rem,div,sum=0;
        while(num!=0)
        {
            rem=num%10;
            sum+=calculate_factorial(rem);
            num/=10;
        }
        if(x==sum) return true;

        return  false;
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        if(check_strongno(first)) System.out.println("It is a strong no ");
        else System.out.println("It is not a strong no ");
    }

}
