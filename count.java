//Write a Java program to count and display the number of characters, words, lines, and
//vowels in a String.
import java.util.Scanner;
public class count {
    static int char_no( String s)
    {
        int n = s.length();
        System.out.println(n);
        int count = 0;
        for(int i =0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c != ' ')
            {
                count++;
            }
            else 
            {
                continue;
            }
        }
        return count;
    }
    static int word_no(String s)
    {
        int n = s.length();
        int count = 0;
        for(int i =0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c == ' ' && s.charAt(i+1) != ' ')
            {
                count++;
            }
        }
        return count+1;
    }
    static int line_no(String s)
    {
        int n = s.length();
        int count = 0;
        for(int i =0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c == '\n')
            {
                count++;
            }
        }
        return count;
    }
    static int vowel_no(String s)
    {
        int n = s.length();
        int count = 0;
        for(int i =0;i<n;i++)
        {
            if(s.toLowerCase().charAt(i) == 'a' ||s.toLowerCase().charAt(i) == 'e' ||
            s.toLowerCase().charAt(i) == 'i' ||
            s.toLowerCase().charAt(i) == 'o' ||
            s.toLowerCase().charAt(i) == 'u' )
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String args[])
    {
        System.out.println("ENTER THE STRING : ");
        String s ;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("c = " + char_no(s) + " w = "+ word_no(s) + " l = "+ line_no(s) + "v = "+vowel_no(s));
        
    }
    
}
