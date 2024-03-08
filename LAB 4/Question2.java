import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        length = 0;
        breadth = 0;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        length = sc.nextDouble();

        System.out.println("Enter the breadth of the rectangle:");
        breadth = sc.nextDouble();

        sc.close();
    }

    public void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        display(area, perimeter);
    }

    public void display(double area, double perimeter) {
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.read();
        rect.calculate();
    }
}

