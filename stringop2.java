//4. Write a menu driven program to do the following:-
//a. To compare two strings
//b. To convert the uppercase character to lower and vice-versa
//c. To display whether an entered string is a substring of the other or not
//d. If the entered string is a substring of the other, replace it with “Hello”

import java.util.Scanner;

public class stringop2 {
    static String swap(String s)
    {
        char[] chars = s.toCharArray();
        for(int i =0 ; i<chars.length ; i++)
        {
            char c = chars[i];
            if(Character.isUpperCase(c))
            {
                chars[i]+=32;
            }
            else if(Character.isLowerCase(c))
            {
                chars[i]-=32;
            }
        }
        return new String(chars);
    }
    static Boolean issub(String s1 , String s2)
    {
        return (s1.contains(s2));
    }
    static void rep(String s1,String s2)
    {
        if(issub(s1,s2))
        {
            StringBuilder res = new StringBuilder();
            for(int i=0;i<s2.length();i++)
            {
                res.append("X");
            }
            System.out.println(s1.replace(s2, res.toString()));
        }
    }
    public static void main (String args[])
    {
        System.out.println("ENTER THE STRINGS : ");
        String s1 , s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println("COMPARISON RESULT : " + s1.compareTo(s2));
        System.out.println("the swapped one is " + swap(s1));
        System.out.println("substring : " + issub(s1, s2));
        System.out.println("replaced one is : " );
        rep(s1, s2);
    }
    
}
