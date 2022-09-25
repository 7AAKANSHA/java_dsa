package java_dsa;

import java.util.Scanner;

public class reverse_string {
    public static String reverse_str(String s)
    {  String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        String s2=reverse_str(str);
        System.out.println(s2);


    }
}
