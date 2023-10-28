/*Write a program that reads a five-letter word from the user and produces all possible 
three letter words that can be derived from the letters of the five letter word. For 
example, the three letter words produced from the word “bathe” include the 
commonly used words “ate,” “bat,” “bet,” “tab,”, “hat,” “the” and “tea.”*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class fiveword {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE 5 LETTER WORD");
        String five = sc.next();
        List<String> arr = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                for(int k=0;k<5;k++)
                {
                    if(i!=j && i!=k && j!=k)
                    {
                        StringBuffer ob = new StringBuffer();
                        ob.append(five.charAt(i));
                        ob.append(five.charAt(j));
                        ob.append(five.charAt(k));
                        arr.add(ob.toString());
                    }
                }
            }
        }
        for(String s : arr)
        {
            System.out.println(s);
        }
    }
}
