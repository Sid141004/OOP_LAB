import java.util.Scanner;

interface shape
{
    public int area();
}
class square implements shape
{
    int length;
    Scanner sc = new Scanner(System.in);
    square()
    {
        System.out.println("enter the length : ");
        length = sc.nextInt();
    }
    public int area()
    {
        return length*length ;
    }

}
class triangle implements shape
{
    int base;
    int height;
    Scanner sc = new Scanner(System.in);
    triangle()
    {
        System.out.println("enter the length of base: ");
        base=sc.nextInt();
        System.out.println("enter the length of height: ");
        height=sc.nextInt();
    }
    public int area()
    {
        double a = 0.5*base*height ;
        int b = (int) a;
        return (b) ;
    }
}

public class interfacesquare {
    public static void main (String args[])
    {
        square r1 = new square();
        System.out.println("the area of square is : " + r1.area());
        triangle c1 = new triangle();
        System.out.println("the area of triangle is : " + c1.area());
    }
}
