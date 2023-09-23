
/*Create a base class for student having registration number, name and age. From this
class create two new class UG and PG student with semester and fees as its data
members. Use proper member function for demonstrating inheritance. Display the
details of students who took admission to UG course and PG course separately, total
number of UG admissions and PG admissions.*/

abstract class student
{
    int reg_no , age ;
    String name ;
    abstract void display();
    public student(int r , String name , int a )
    {
        this.reg_no = r;
        this.name = name;
        this.age = a;
    }
}
class UG extends student 
{
    int sem , fee ;
    public UG(int r , String name , int a , int sem , int fee )
    {
        super(r, name, a);
        this.sem = sem;
        this.fee = fee;
    }
    void display()
    {
        System.out.println("STUDENT NAME : " + name );
        System.out.println("STUDENT REGISTRATION NAME : " + reg_no);
        System.out.println("STUDENT AGE : " + age);
        System.out.println("CURRENT SEMESTER : " + sem );
        System.out.println("FEE : Rs." + fee);
    }
}
class PG extends student
{
    int sem , fee;
    public PG(int r,String name , int a , int sem , int fee)
    {
        super(r,name,a);
        this.sem = sem;
        this.fee = fee;
    }
    void display()
    {
        System.out.println("STUDENT NAME : " + name );
        System.out.println("STUDENT REGISTRATION NAME : " + reg_no);
        System.out.println("STUDENT AGE : " + age);
        System.out.println("CURRENT SEMESTER : " + sem );
        System.out.println("FEE : Rs." + fee);
    }
}
class lab62 {
    public static void main(String[] args)
    {
        UG s1 = new UG(220953490,"siddharth",18,3,390000);
        UG s2 = new UG(220953470,"avinash",18,3,290000);
        s1.display();
        s2.display();

        PG s3 = new PG(250953490,"big",28,1,190000);
        PG s4 = new PG(250953470,"small",28,1,590000);
        s3.display();
        s4.display();

    }
}

