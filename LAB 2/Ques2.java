import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int evencount=0;
        int oddcount=0;

        System.out.println("Enter 10 Numbers : ");
        {
            for(int i=1; i<=10; i++){
                int number = obj.nextInt();
                if (number%2 == 0)
                evencount++;
                else
                oddcount++;
            }
        }

        System.out.println("Even numbers are :" +evencount);
        System.out.println("Odd numbers are :" +oddcount);
    }
}
