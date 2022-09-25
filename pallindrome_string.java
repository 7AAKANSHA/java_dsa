package java_dsa;

import java.util.Scanner;

public class pallindrome_string {
    public static boolean check_pallindrome(String str)
    {
        String s="";
        for(int i=str.length()-1;i>=0;i--)
        {
            s+=str.charAt(i);
        }
        if(s.toLowerCase().equals(str.toLowerCase())) return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        if(check_pallindrome(string)) System.out.println("It is a pallindrome");
        else
            System.out.println("Not a Pallindrome");


    }
}
