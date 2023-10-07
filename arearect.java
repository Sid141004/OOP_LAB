import java.util.Scanner;

abstract class shape
{
    abstract int area();
}
class rect extends shape
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
    int area()
    {
        return length*breadth ;
    }

}
class circle extends shape
{
    int radius ;
    Scanner sc = new Scanner(System.in);
    circle()
    {
        System.out.println("enter the radius : ");
        radius=sc.nextInt();
    }
    int area()
    {
        double a =  Math.PI*Math.pow(radius, 2);
        int b = (int) a;
        return (b) ;
    }
}
public class arearect 
{
    public static void main (String args[])
    {
        rect r1 = new rect();
        System.out.println("the area of rectangle is : " + r1.area());
        circle c1 = new circle();
        System.out.println("the area of circle is : " + c1.area());
    }
    
}
