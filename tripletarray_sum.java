package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class tripletarray_sum {
 public static void checktriplet_sum(int a[],int sum)
 {
     int i,j,k;
     for(i=0;i<a.length;i++)
     {
         for(j=i+1;j<a.length;j++)
         {
             for(k=j+1;k<a.length;k++)
             {
                 if(a[i]+a[j]+a[k]==sum)
                 {
                     System.out.println(a[i]+","+""+a[j]+","+" "+a[k]);
                 }
             }
         }
     }
 }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int s =scanner.nextInt();
        int[] myArray = {0,1,2,-1,2};
        System.out.println("Input Array:" + Arrays.toString(myArray));
        checktriplet_sum(myArray,s);
    }
}
