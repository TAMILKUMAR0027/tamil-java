package TKSCJC;

public class Employees {

    int empid;
    String empNam;
    double empsal;

    Employees(int empid, String empName, double empsal) {
        this.empid = empid;
        this.empNam = empName;
        this.empsal = empsal;
        System.out.println("Employee record created");
    }

    Employees() {
        this(101, "Muhi", 300000);
        System.out.println("Default constructor called");
    }

    void register() {
        System.out.println("Registering Employee");
        display();
    }

    void display() {
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Name: " + empNam);
        System.out.println("Employee Salary : " + empsal);
    }

    void sendhr() {
        Hrdept hr = new Hrdept();
        hr.processEmployee(this);
    }

    Employees updatesal(double hikper) {
        this.empsal = empsal + (empsal * hikper / 100);
        return this;
    }

    Employees updname(String newName) {
        this.empNam = newName;
        return this;
    }

    class Hrdept {
        void processEmployee(Employees a) {
            System.out.println("Hr dept processing");
            System.out.println("Processed employee : " + a.empid + " " + a.empNam);
        }
    }

    public static void main(String[] args) {

        Employees a1 = new Employees();
        a1.register();
        Employees a2 = new Employees(17,"Tamil",20000);
        a2.register();

        
    }
}
