
class Student {

    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------------");
    }
}

public class StudentRegister {
    public static void main(String[] args) {

        Student student1 = new Student("Kieza", 1, 98);
        Student student2 = new Student("Kiara", 2, 97);
        Student student3 = new Student("Aline", 3, 95);
        Student student4 = new Student("Mayron", 4, 93);
        Student student5 = new Student("Angelina", 5, 92);
        Student student6 = new Student("Emmanuel", 6, 90);
        Student student7 = new Student("Sydney", 7, 89);
        Student student8 = new Student("Kiane", 8, 88);
        Student student9 = new Student("Edwany", 9, 87);
        Student student10 = new Student("Matteo", 10, 85);

        System.out.println("Top 10 Students of Class 10 - St. Joseph High School");
        System.out.println("====================================================");

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
        student5.displayDetails();
        student6.displayDetails();
        student7.displayDetails();
        student8.displayDetails();
        student9.displayDetails();
        student10.displayDetails();
    }
}