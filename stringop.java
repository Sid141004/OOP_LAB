/*3. Write a menu driven program to do the following:-
a. To check whether a string is palindrome or not
b. Write the string in an alphabetical order
c. Reverse the string
d. Concatenate the original string and the reversed string*/
import java.util.Scanner;
class stringop {
    static boolean palin(String s)
    {
        int n = s.length();
        int j = n-1;
        for(int i=0;i!=j;i++,j--)
        {
            if( s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
    static String alpha(String s)
    {
        char[] chars = s.toCharArray();
        java.util.Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
    static String rev(String s)
    {
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed ;
    }

    public static void main(String args[])
    {
        System.out.println("ENTER THE STRING : ");
        String s ;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println(palin(s));
        System.out.println("the sorted string is " + alpha(s));
        System.out.println("reversed string is  " + rev(s));
        System.out.println("concatenated string is " + s.concat(rev(s)));
    }
    
}