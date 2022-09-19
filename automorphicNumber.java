package java_dsa;

import java.util.Scanner;

public class automorphicNumber {
    public static boolean is_automorphicno(int num)
    {   int x=num;
        int square=num*num;
        while(num>0)
        {
            if(square%10!=num%10) return false;
                square/=10;
            num/=10;
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        if(is_automorphicno(first)) System.out.println("It is a Automorphic no ");
        else System.out.println("It is not a Automorphic no ");
    }
}
