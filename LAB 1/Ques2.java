import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your Marks : ");
        int marks = obj.nextInt();

        if(marks >= 90)
        {
            System.out.println("Grade : O");
        }
        else if(marks >= 80)
        {
            System.out.println("Grade : E");
        }
        else if(marks >= 70)
        {
            System.out.println("Grade : A");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade : B");
        }
        else if(marks >= 50)
        {
            System.out.println("Grade : C");
        }
        else if(marks >= 40)
        {
            System.out.println("Grade : D");
        }
        else
        {
            System.out.println("Grade : F");
        }
    }
}
