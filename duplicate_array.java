package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class duplicate_array {
    public static int remove_dupli(int a[],int n)
    {   int j=0;
        int []temp=new int[n];
         for(int i=0;i<n-1;i++)
         {
             if(a[i]!=a[i+1])
             {
                 temp[j++]=a[i];
             }
         }
         temp[j++]=a[n-1];
         for (int i=0;i<j;j++)
         {
             a[j]=temp[j];
         }
         return j;
    }
    public static void main(String[]args)

    {   int len;
        Scanner scanner=new Scanner(System.in);
        int s =scanner.nextInt();
        int [] ar=new int[s];
        for(int i=0;i<s;i++)
        {
            ar[i]= scanner.nextInt();
        }
        System.out.println("Input Array:" + Arrays.toString(ar));
        remove_dupli(ar,s);


        //System.out.println(res);
    }
}
