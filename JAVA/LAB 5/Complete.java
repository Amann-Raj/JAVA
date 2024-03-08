

interface Employee {
    double earnings(double basicSalary);
    double deductions(double basicSalary);
    double bonus(double basicSalary);
}
class Manager implements Employee {
    public double earnings(double basicSalary) {
        double da = 0.8 * basicSalary;
        double hra = 0.15 * basicSalary;
        return basicSalary + da + hra;
    }


    public double deductions(double basicSalary) {
        return 0.12 * basicSalary;
    }

  
    public double bonus(double basicSalary) {
        return 0; 
    }
}

class Substaff extends Manager {
    public double bonus(double basicSalary) {
     return 0.5 * basicSalary;
 }
}
public class Complete {
    public static void main(String[] args) {
        double basicSalary = 50000;

        Substaff substaff = new Substaff();

        double earnings = substaff.earnings(basicSalary);
        double deduction = substaff.deductions(basicSalary);
        double bonus = substaff.bonus(basicSalary);

        System.out.println("Earnings: " + earnings);
        System.out.println("Deduction: " + deduction);
        System.out.println("Bonus: " + bonus);
    }
}
