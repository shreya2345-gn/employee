public class Employee {
    private String name;
    private int id;
    private double salary;
    private String address;  // Added missing field

    // Constructor
    public Employee(String name, int id, double salary, String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;  // Properly initializing address
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);  // Added address to display output
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee emp1 = new Employee("Shreya", 277, 800000.0, "Bengaluru");  // Provided an address argument
        emp1.displayInfo();
    }
}