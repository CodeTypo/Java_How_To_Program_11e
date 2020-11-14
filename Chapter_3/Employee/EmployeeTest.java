public class EmployeeTest{
	public static void main(String[] args){
		Employee em1 = new Employee("John","Godson",65000.44);
		Employee em2 = new Employee("Joanna","Czajkowska",51000.44);
		
		System.out.printf("Employee em1 salary is: %.2f%n",em1.getSalary());
		System.out.printf("Employee em2 salary is: %.2f%n",em2.getSalary());
		
		em1.setSalary(em1.getSalary() + (0.1 * em1.getSalary()));
		em2.setSalary(em2.getSalary() + (0.1 * em2.getSalary()));
	
		System.out.printf("Employee em1 salary is: %.2f%n",em1.getSalary());
		System.out.printf("Employee em2 salary is: %.2f%n",em2.getSalary());
	
	}
}