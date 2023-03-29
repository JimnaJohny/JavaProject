package FirstPackage;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.employeeId = 1101;
		employee.employeeName = "Jimna";
		employee.emailId = "jimna@yahoo.com";
		employee.address = "Canada";
		employee.department = "QA";
		employee.payRate = 32.5;
		employee.completedOneYear = true;
		System.out.println("Details of " + employee.employeeName + "");
		employee.work();
		employee.getSalary();
		employee.getBenefits();
	}

}
