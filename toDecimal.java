package java_dsa;

import java.util.Scanner;

public class toDecimal {

    public static int binary_to_decimal(int num)
    {
        int rem,result=0,div,n=0;

        if(num==0) return  0;
        while(num!=0)
        {
            rem=num%10;
            result+=rem*Math.pow(2,n);
            num/=10;
            n++;
        }
        return result;
    }

    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

       int res= binary_to_decimal(number);
       System.out.println(res);
    }
}
