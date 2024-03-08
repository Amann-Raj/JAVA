import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first name : ");
        String first = obj.nextLine();

        System.out.println("Enter the second name : ");
        String second = obj.nextLine();
        
        System.out.println(second +" "+ first);
    }
}