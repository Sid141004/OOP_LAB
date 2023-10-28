//Write a program to accept an array of strings and arrange them in alphabetical order.
import java.util.Scanner;
public class alpharray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] ob = new String[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("ENTER THE STRING :");
            String s = sc.nextLine();
            ob[i] = s;
        }
        java.util.Arrays.sort(ob);
        for(String str : ob)
        {
            System.out.println(str);
        }
    }
}
