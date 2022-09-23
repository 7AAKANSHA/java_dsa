package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class array_freq {
    public static void check_freq(int a[])
    {  Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            int count=1;
            while(i<a.length-1&& a[i]==a[i+1])
            {   i++;
                count ++;

            }
            System.out.println(a[i]+":"+count);
            count++;
        }

    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int s =scanner.nextInt();
        int[] myArray = {60,1,2,-1,20,30,40,40,60,20,2,-1};
        System.out.println("Input Array:" + Arrays.toString(myArray));
        check_freq(myArray);
    }
}
