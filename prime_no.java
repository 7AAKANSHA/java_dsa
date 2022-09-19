package java_dsa;


import java.util.Scanner;

public class prime_no {
    public static boolean checkprime(int x) {
        if(x==0 || x==1  ) return false;
        if(x==2) return true;
        int count=0;
        for(int i=3;i<=x;i++)
        {
         if(x%i==0) count ++;

        }
        if(count>=2) return false;
return true;

    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        if(checkprime(first)) System.out.println("It is Prime no ");
        else System.out.println("Not a prime no ");
    }
}