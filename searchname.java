//Develop a program for searching a student from a class. Assume a set of 10 students 
//with their details as Registration number, First Name, Last Name and Degree in an 
//array of Student objects. Search a student either by First Name or Last Name.

import java.util.Scanner;

class student
{
    int reg_no;
    String first , last , degree;
    public student(int r , String f , String l , String d)
    {
        reg_no = r;
        first = f;
        last =l;
        degree = d;
    }
} 
public class searchname {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        student[] ob = new student[3];
        for(int i =0 ; i<3 ;i++)
        {
            System.out.println("reg no:");
            int r = sc.nextInt();
            System.out.println("first :");
            String f = sc.next();
            System.out.println("last :");
            String l=sc.next();
            System.out.println("degree :");
            String d = sc.next();
            ob[i]= new student(r, f, l, d);
        }
        System.out.println("enter the First name or Last name : ");
        String k = sc.next();
        int flag =0;
        for(student s : ob)
        {
            if(s.first.compareTo(k)==0 || s.last.compareTo(k)==0)
            {
                System.out.println("reg : " + s.reg_no + " name : " + s.first +" "+ s.last + " degree : " + s.degree);
                flag = 1;
            }
        }
        if(flag==0)
        {
            System.out.println("student not found");
        }
    }
}
