import java.util.Scanner;
class Ques1{
    public static void main(String args[]){
       Scanner obj = new Scanner(System.in);

       System.out.println("Enter your Name ");
       String N = obj.nextLine();

       System.out.println("Enter your Roll");
       int a = obj.nextInt();
       obj.nextLine();

       System.out.println("Enter your Section ");
       String s = obj.nextLine();
       
       System.out.println("Enter your Branch ");
       String b = obj.nextLine();

       System.out.println("Name  - "+N);
       System.out.println("Roll - "+a);
       System.out.println("Section - "+s);
       System.out.println("Branch - "+b);
    }
}