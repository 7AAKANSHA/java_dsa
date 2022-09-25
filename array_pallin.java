package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class array_pallin {
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
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int s =scanner.nextInt();
        int[] myArray  = new int[s];
        for(int i=0;i<s;i++)
        {
            myArray[i]= scanner.nextInt();
        }
        System.out.println("Input Array:" + Arrays.toString(myArray));
        int res= Integer.MIN_VALUE;
        for(int i=0;i<s;i++)
        { if( check_pallindrome(myArray[i])&&res<myArray[i])
            res = myArray[i];
    }
        if(res== Integer.MIN_VALUE)
        {
            res= -1;
        }
        System.out.println(res);
}}
