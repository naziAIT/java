interface Payable {
    double getPaymentAmount();
}
abstract class Employee {
    String name;
    int id;
    double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Payable {
    public FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary * 1.2; // +20% к зарплате
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}
class ContractEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}
class O {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 1, 5000);
        Employee contract = new ContractEmployee("Bob", 2, 20, 160);

        fullTime.displayEmployeeInfo();
        contract.displayEmployeeInfo();
    }
}
