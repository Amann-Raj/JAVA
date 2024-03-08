import java.util.Scanner;

class Account {
    protected int acc_no;
    protected double balance;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = scanner.nextInt();
        System.out.print("Enter account balance: ");
        balance = scanner.nextDouble();
        scanner.nextLine(); 
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}

class Person extends Account {
    private String name;
    private long aadhar_no;

    public void input() {
        super.input(); 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person's name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = scanner.nextLong();
        scanner.nextLine(); 
    }

    public void disp() {
        super.disp(); 
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class question44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        scanner.nextLine(); 

        Person[] persons = new Person[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDetails of " + numPersons + " persons:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1));
            persons[i].disp();
        }
    }
}
