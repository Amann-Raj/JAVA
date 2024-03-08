import java.util.Scanner;

class TwoD {
    double length;
    double breadth;

    public TwoD(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() 
    {
        return length * breadth;
    }
}

class ThreeD extends TwoD {
    private double height;

    public ThreeD(double length, double breadth, double height) 
    {
        super(length, breadth);
        this.height = height;
    }

    public double calculateVolume() 
    {
        return calculateArea() * height;
    }
}

public class question41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the 2D sheet (in feet): ");
        double sheetLength = scanner.nextDouble();
        System.out.print("Enter the breadth of the 2D sheet (in feet): ");
        double sheetBreadth = scanner.nextDouble();

        System.out.print("Enter the height of the 3D box (in feet): ");
        double boxHeight = scanner.nextDouble();

        TwoD sheet = new TwoD(sheetLength, sheetBreadth);
        ThreeD box = new ThreeD(sheetLength, sheetBreadth, boxHeight);

        double sheetCost = sheet.calculateArea() * 40;
        double boxCost = box.calculateVolume() * 60; 

        System.out.println("Cost of the 2D sheet: Rs " + sheetCost);
        System.out.println("Cost of the 3D box: Rs " + boxCost);

        scanner.close();
    }
}
