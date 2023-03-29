package FirstPackage;

public class Employee {

 int employeeId;
 String employeeName;
 String emailId;
 String address;
 String department;
 double payRate;
 boolean completedOneYear;
	
void work(){
	System.out.println("This employee is working in "+ department +" department"); 
 }
 
void getSalary() {
	System.out.println("Employee is earning $"+ payRate +" per hour");
}
void getBenefits() {
	System.out.println("Eligible for benefits: "+ completedOneYear +"");
}
}
