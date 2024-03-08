interface Employee {
    void getDetails(int empId, String empName);
}


interface Manager extends Employee {
    void getDeptDetails(int deptId, String deptName);
}


class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

   
    public void getDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    
    public void getDeptDetails(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }
}

class Details {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails(123, "Sidharth Ambani");
        head.getDeptDetails(6, "IT Department");
        head.displayDetails();
    }
}