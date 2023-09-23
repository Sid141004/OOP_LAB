class Student_Detail {
    private String name;
    private int id;
    private String college_name;

    public Student_Detail(String name, int id, String college_name) {
        this.name = name;
        this.id = id;
        this.college_name = college_name;
    }

    public void display_details() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("College Name: " + college_name);
    }
}
public class labmit {
    public static void main(String[] args) {
        Student_Detail student1 = new Student_Detail("ram", 101, "MIT");
        Student_Detail student2 = new Student_Detail("vijay", 102, "MIT");

        System.out.println("Student 1 Details:");
        student1.display_details();

        System.out.println("\nStudent 2 Details:");
        student2.display_details();
    }
}
