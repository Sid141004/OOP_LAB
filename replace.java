//Write a Java program to replace an entered word to all repeating characters.
import java.util.Scanner;

public class replace
{
    public static void main(String args[])
    {
        System.out.println("ENTER THE MAIN STRING : ");
        String s1 ;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        System.out.println("ENTER THE WORD TO BE REPLACED : ");
        String s2 = sc.next();
        int l = s2.length();
        int i=0;
        StringBuilder s3 = new StringBuilder();
        for(i=0;i<l;i++)
        {
            s3.append('X');
        }
        System.out.println(s1.replace(s2, s3.toString()));
    }
}