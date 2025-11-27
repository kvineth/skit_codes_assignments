package InhSupThis;

//Parent class Employee
class Employee 
{
	protected double salary; // Protected to allow access in child classes

 	public Employee(double salary) 
 	{
 		this.salary = salary;
 	}

	 public double getSalary()
	 {
	     return salary;
	 }
}

//Child class Developer
class Developer extends Employee 
{
	private double bonus;

	 public Developer(double salary, double bonus) 
	 {
	     super(salary); // Call parent class constructor to initialize salary
	     this.bonus = bonus; // Initialize child class variable
	 }

	 public double getTotalSalary() 
	 {
	     // Access parent's salary using super and child's bonus using this
	     return super.salary + this.bonus; 
	 }
}

//Main class to test the implementation
public class emp 
{
	 public static void main(String[] args) 
	 {
	     Developer dev = new Developer(50000.0, 10000.0);
	     System.out.println("Total Salary of Developer: " + dev.getTotalSalary());
	 }
}