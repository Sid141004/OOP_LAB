/*Imagine a company that markets both hardware and software. Create an interface
that will be implemented by two classes hardware and software, where hardware
item holds the category of item and its original manufacturer and software holds
type of software and operating system under which it works. Calculate the total
sales for hardware as well as software item recorded for last 3months*/

interface company
{
    int tot_sales();
    void disp();
}
class hardware implements company 
{
    String item , org_man;
    int[] sales;
    int count = 0;
    hardware(String item , String org_man , int[] a)
    {
        this.item = item;
        this.org_man= org_man;
        this.sales = a;
    }
    public void disp()
    {
        System.out.println("ITEM CATEGORY : " + item );
        System.out.println("ORIGINAL MANUFACTURER : " + org_man);
    }
    int tot_sales(int n )
    {
        for(int i = n-3 ; i<n ; i++)
        {
            count+=sales[i];
        }
        return count;
    }
}
class software implements company 
{
    String type , os;
    int[] sales;
    int count , flag =0;
    software(String type , String os, int[] a)
    {
        this.type= type;
        this.os= os;
        this.sales = a;
    }
    public void disp()
    {
        System.out.println("SOFTWARE TYPE: " + type );
        System.out.println("OPERATING SYSTEM : " + os);
    }
    int tot_sales(int n)
    {
        for(int i = n-3 ; i<n ; i++)
        {
            count+=sales[i];
        }
        return count;
    }
}
public class labcompany {
    public static void main ( String args[])
    {
        int[] a = { 1000 , 2000 , 3000 , 4000 , 5000};
        int n = 5;
        hardware ob1 = new hardware("strong ","google", a);
        software ob2 = new software("free", "ios", a);
        ob1.disp();
        System.out.println(ob1.tot_sales(n));
        ob2.disp();
        System.out.println(ob2.tot_sales(n));
    }
}
