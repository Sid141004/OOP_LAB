import java.util.Scanner;
/* Write a java program to create an interface called “sports” with methods
getNumberOfGoals and dispTeam. Create classes Hockey and football that uses the
interface “sports”. Write the appropriate code for the methods to display the goals and
the wining team considering at least two teams */
interface sport
{
    public void getNumberOfGoals();
    public void dispTeam();
}
class hockey implements sport
{
    int count = 0 , n , w = 0 ,i , j;
    Scanner sc = new Scanner(System.in);
    hockey()
    {
        System.out.println("enter the number of teams playing hockey : ");
        n = sc.nextInt();
    }
    int[] a = new int[10];
    public void getNumberOfGoals()
    {
        for(i=0;i<n;i++)
        {
            System.out.println("enter the goals scored by team " + (i+1) + " :");
            a[i]=sc.nextInt();
        }
    }
    public void dispTeam()
    {
        for(i=0;i<n;i++)
        {
            System.out.println("the goals scored by team " + (i+1) + " :" + a[i]);
        }
        w=i;
        for(i=0;i<n;i++)
        {
            if(a[w]<a[i])
            {
                w=i;
            }
        }
        System.out.println("THE WINNING TEAM IN HOCKEY IS " + (w+1) + " with " +a[w] + " goals");
    }
}
class football implements sport
{
    int count = 0 , n , w = 0 ,i , j;
    Scanner sc = new Scanner(System.in);
    football()
    {
        System.out.println("enter the number of teams playing football : ");
        n = sc.nextInt();
    }
    int[] a = new int[10];
    public void getNumberOfGoals()
    {
        for(i=0;i<n;i++)
        {
            System.out.println("enter the goals scored by team " + (i+1) + " :");
            a[i]=sc.nextInt();
        }
    }
    public void dispTeam()
    {
        for(i=0;i<n;i++)
        {
            System.out.println("the goals scored by team " + (i+1) + " :" + a[i]);
        }
        w=i;
        for(i=0;i<n;i++)
        {
            if(a[w]<a[i])
            {
                w=i;
            }
        }
        System.out.println("THE WINNING TEAM IN FOOTBALL IS " + (w+1) + " with " +a[w] + " goals");
    }
}
public class sports {
    public static void main(String args[])
    {
        hockey h1 = new hockey();
        football f1 = new football();
        h1.getNumberOfGoals();
        h1.dispTeam();
        f1.getNumberOfGoals();
        f1.dispTeam();
    }
}
