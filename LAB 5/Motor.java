import java.util.Scanner;

interface Motor {
    void run();
    void consume();

}
class WashingMachine implements Motor {
    double capacity;

    WashingMachine(double capacity) {
        this.capacity = capacity;
    }

    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Capacity of the motor is " + capacity);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the washing machine: ");
        double capacity = scanner.nextDouble();
        scanner.close();

        WashingMachine washingMachine = new WashingMachine(capacity);

        washingMachine.consume();
    }
}
