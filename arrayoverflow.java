import java.util.Scanner;
class arrayoverflow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("ENTER ELEMENTS OF THE ARRAY : \nENTER 9999 TO EXIT");
        try
        {
            int i=0;
            while(true)
            {
                int n = sc.nextInt();
                if(n == 9999)
                {
                    break;
                }
                arr[i++]=n;
                System.out.println("SUCCESFULLY ADDED.");
            }
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("SOME PROBLEM HAS OCCURED ");
            System.out.println("ARRAY MAX LIMIT REACHED!!");
        }
    }
}
