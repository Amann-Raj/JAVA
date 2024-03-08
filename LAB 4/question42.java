import java.util.Scanner;

class Plate {
    protected double length, width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void displayDimensions() {
        System.out.println("Plate dimensions:");
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
    }
}

class Box extends Plate {
    protected double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public void displayDimensions() {
        super.displayDimensions();
        System.out.println("Box dimensions:");
        System.out.println("Height: " + height + " cm");
    }
}

class WoodBox extends Box {
    protected double thickness;

    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
    }

    public void displayDimensions() {
        super.displayDimensions();
        System.out.println("WoodBox dimensions:");
        System.out.println("Thickness: " + thickness + " cm");
    }
}

public class question42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the plate(in cm): ");
        double plateLength = scanner.nextDouble();

        System.out.print("Enter the width of the plate(in cm): ");
        double plateWidth = scanner.nextDouble();

        System.out.print("Enter the height of the box(in cm): ");
        double boxHeight = scanner.nextDouble();

        System.out.print("Enter the thickness of the wood box(in cm): ");
        double woodBoxThickness = scanner.nextDouble();

        scanner.close();

        WoodBox woodBox = new WoodBox(plateLength, plateWidth, boxHeight, woodBoxThickness);
        woodBox.displayDimensions();
    }
}
