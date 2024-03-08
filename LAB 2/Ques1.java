import java.util.Scanner;

public class Ques1 {
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Num 1 is Largest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Num 2 is Largest");
        }
        else{
            System.out.println("Num 3 is Largest");
        }
    }
}
