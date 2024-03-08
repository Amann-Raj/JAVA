import java.util.Scanner;

abstract class Student {
    int rollno;
    int regno;

    void getinput(int rollno,int regno)
    {
        this.rollno=rollno;
        this.regno=regno;
    }

    abstract void course();
}
class Kiitian extends Student {
    void course()
    {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}
class Driver {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Kiitian kiitian = new Kiitian();

        System.out.println("Enter the Roll No :");
        int rollno = obj.nextInt();

        System.out.println("Enter the Reg No :");
        int regno = obj.nextInt();

        kiitian.getinput(rollno, regno);

        kiitian.course();

    }
}

