import java.util.Scanner;

class Geometry {
    void area(double side) {
        double squareArea = side * side;
        System.out.println("Area of the square: " + squareArea);
    }

    void area(double length, double breadth) {
        double rectangleArea = length * breadth;
        System.out.println("Area of the rectangle: " + rectangleArea);
    }

    void area(double radius, String shape) {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of the " + shape + ": " + circleArea);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Geometry geometry = new Geometry();

        System.out.print("Enter the shape (circle/triangle/square): ");
        String shape = input.nextLine();

        if (shape.equalsIgnoreCase("circle")) {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();
            geometry.area(radius, shape);
        } else if (shape.equalsIgnoreCase("triangle")) {
            System.out.print("Enter the base of the triangle: ");
            double base = input.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = input.nextDouble();
            geometry.area(base, height);
        } else if (shape.equalsIgnoreCase("square")) {
            System.out.print("Enter the side length of the square: ");
            double side = input.nextDouble();
            geometry.area(side);
        } else {
            System.out.println("Invalid shape entered. Please choose circle, triangle, or square.");
        }
    }
}