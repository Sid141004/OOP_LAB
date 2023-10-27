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
        int j = n;
        for(int i=0;i!=j;i++,j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println("ENTER THE STRING : ");
        String s ;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        System.out.println(palin(s));
    }
    
}
