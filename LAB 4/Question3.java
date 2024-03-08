import java.util.Scanner;

class Student {

    private int roll;
    private String name;
    private double cgpa;

   
    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the roll number of student " + (i + 1) + ":");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter the name of student " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Enter the cgpa of student " + (i + 1) + ":");
            double cgpa = sc.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }

        sc.close();

        System.out.println("The details of the students are:");
        for (int i = 0; i < n; i++) {
            students[i].display();
            System.out.println();
        }

        Student lowest = students[0]; 
        for (int i = 1; i < n; i++) {
            if (students[i].getCgpa() < lowest.getCgpa()) {
                lowest = students[i];
            }
        }

        System.out.println("The name of the student with the lowest cgpa is: " + lowest.getName());
    }
}
