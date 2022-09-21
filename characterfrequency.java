package java_dsa;

import java.util.Scanner;

public class characterfrequency {
    public static int countfreq(String s,char ch)
    { int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        char c=scanner.next().charAt(0);

        System.out.println(countfreq(word,c));


    }
}
