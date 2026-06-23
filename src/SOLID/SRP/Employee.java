package SOLID.SRP;

public class Employee {
    String employeeName;
    int employeeId;
    String employeeCity;
    int employeeSalary;

    Employee(String employeeName, int employeeId, String employeeCity, int employeeSalary){
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void generateEmployeePerformanceReport(){
        System.out.println("Employee report is being generated");
    }

    public void updateEmployeeData(){
        System.out.println("updating employee data");
    }

    public double computeSalary(){
        return Double.valueOf(100);
    }
}
