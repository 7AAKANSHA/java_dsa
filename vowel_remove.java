package java_dsa;

import java.util.Scanner;

public class vowel_remove {
    public static void remove_vowel(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||
            s.charAt(i)=='i'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||
                    s.charAt(i)=='O'||s.charAt(i)=='U')
            { continue;}
            else {System.out.print(s.charAt(i));}

        }
    }
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();

        remove_vowel(string);
    }
}
