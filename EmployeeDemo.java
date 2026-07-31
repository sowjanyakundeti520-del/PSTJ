class Employee{
    int empId;
    String empName;
    int salaryPerDay = 1000;

    void print(int id, String name) {
        empId = id;
        empName = name;

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    void calculateSalary(int days) {
        int salary = salaryPerDay * days;
        System.out.println("Salary = " + salary);
        System.out.println();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.print(101, "Ram");
        e1.calculateSalary(25);

        Employee e2 = new Employee();
        e2.print(102, "Ravi");
        e2.calculateSalary(28);

        Employee e3 = new Employee();
        e3.print(103, "Priya");
        e3.calculateSalary(30);
    }
}