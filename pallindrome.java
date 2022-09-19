package java_dsa;

import java.util.Scanner;

public class pallindrome {

    public static boolean check_pallindrome(int x)
    {
        int num=x;
        int rem,div,n=0;
        while(num!=0)
        {
            rem=num%10;
            n=n*10+rem;
            num/=10;
        }
        if(x==n) return  true;
        return  false;
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        if(check_pallindrome(number)) System.out.println("It is a pallindrome no");
        else System.out.println("It's not a Pallindrome No!");
    }
}
