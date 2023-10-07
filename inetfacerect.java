import java.util.Scanner;

interface shape
{
    public int area();
}
class rect implements shape
{
    int length , breadth ;
    Scanner sc = new Scanner(System.in);
    rect()
    {
        System.out.println("enter the length : ");
        length=sc.nextInt();
        System.out.println("enter the breadth : ");
        breadth=sc.nextInt();
    }
    public int area()
    {
        return length*breadth ;
    }

}
class circle implements shape
{
    int radius ;
    Scanner sc = new Scanner(System.in);
    circle()
    {
        System.out.println("enter the radius : ");
        radius=sc.nextInt();
    }
    public int area()
    {
        double a =  Math.PI*Math.pow(radius, 2);
        int b = (int) a;
        return (b) ;
    }
}

public class inetfacerect {
    public static void main (String args[])
    {
        rect r1 = new rect();
        System.out.println("the area of rectangle is : " + r1.area());
        circle c1 = new circle();
        System.out.println("the area of circle is : " + c1.area());
    }
}
