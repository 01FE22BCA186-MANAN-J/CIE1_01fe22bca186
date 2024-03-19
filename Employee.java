public class Employee {
    public String name;
    public int employeeId;
    public double salary;

   Employee(String name,int employeeId,double salary){
    this.employeeId=employeeId;
    this.name=name;
    this.salary=salary;
   }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}