public class DevopsEngineer extends Employee {

    public double bonus;
    DevopsEngineer(String name, int employeeId, double salary,double bonus) {
        super(name, employeeId, salary);
        this.bonus=bonus;
    }
   

 public double calculateTotalSalary() {
     return (salary*bonus);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: 5.33" + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
    public static void main(String[] args) {
        DevopsEngineer de =new DevopsEngineer("Manan", 456, 4562.9,5.33);
        de.calculateTotalSalary();
        de.displayDetails();
    }
}






