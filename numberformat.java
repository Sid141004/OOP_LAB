import java.util.Scanner;
class numberformat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = 0;
        try
        {
            n = Integer.parseInt(s);
            System.out.println("converted to integer : " + n);
        }
        catch(NumberFormatException m)
        {
            System.out.println("CONVERSION FAILED : " + m);
        }
        
    }
}