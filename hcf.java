package java_dsa;

import java.util.Scanner;

public class hcf {
    public static int find_highestfactor(int x,int y)
    {   int hc=0;
        for(int i=1;i<=x&&i<=y;i++)
        {
            if(x%i==0&&y%i==0)
            {
                hc=i;
            }
        }
        return hc;
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number_1=scanner.nextInt();
        int number_2=scanner.nextInt();
        System.out.println( find_highestfactor(number_1,number_2));
    }
}
