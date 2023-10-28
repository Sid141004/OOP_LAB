/*Write a program that inputs a telephone number as a string in the form (555) 555-
5555. Use String method to extract the area code as a token, the first three digits of 
the phone number as a token and the last four digits of the phone number as a token. 
Display area code and seven digit phone number separately*/
import java.util.Scanner;
public class telephonestr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER IN (XXX) XXX-XXXX : ");
        String num = sc.nextLine();
        String[] arr = num.split(" ", 2);
        System.out.println("AREA CODE : " + arr[0] + "\nNUMBER : " + arr[1]);
    }    
}
