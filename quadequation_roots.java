package java_dsa;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class quadequation_roots {

    public static void find_roots(int a, int b ,int c)
    {
        float discriminant;
        double root_1;
        double root_2;
        discriminant=(-b/2*a);
        double sqrt_val = sqrt(abs(discriminant));

        if(discriminant>0)
        {
            root_1=(double)(-b+ sqrt_val)/(2*a);
            root_2=(double) (-b- sqrt_val)/(2*a);
            System.out.println(root_1);
            System.out.println(root_2);

        } else if (discriminant==0) {
            root_1=(-b/2*a);
            root_2=(-b/2*a);
            System.out.println(root_1);
            System.out.println(root_2);
        }
        else
        {
            System.out.println((-b/2*a)+ "i"+ sqrt(discriminant));
            System.out.println((-b/2*a)+ "i"+ sqrt(discriminant));
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y= scanner.nextInt();
        int z= scanner.nextInt();

        find_roots(x,y,z);



    }
}
