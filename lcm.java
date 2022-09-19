package java_dsa;
import java.util.Scanner;

class lcm
{
    public static int  lcm_calculate(int x , int y)
    {  int gcd=1,result;
        for(int i=1;i<=x&& i<=y;i++)
        {
            if(x%i==0 && y%i==0)
                gcd=i;
        }
        result=x*y/gcd;
        return  result;
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        int lcm_of_two=lcm_calculate(first,second);
        System.out.println(lcm_of_two);
    }
}