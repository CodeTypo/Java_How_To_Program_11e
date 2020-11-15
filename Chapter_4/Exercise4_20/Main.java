import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employeeArray = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.print("Please enter the employee's name: ");
            String name = sc.nextLine();
            System.out.print("Please enter the employee's hour rate: ");
            double hourRate = sc.nextDouble();
            sc.nextLine();
            employeeArray.add(new Employee(name,hourRate));
        }

        for (Employee employee : employeeArray) {
            String employeeName = employee.getName();
            System.out.println("Enter amount of hours worked by: " + employeeName);
            double hoursWorked = sc.nextDouble();
            employee.setHoursWorked(hoursWorked);
            System.out.println("Emploee; " + employeeName + " grossPay: " + employee.grossPay());
        }
        sc.close();
    }
}
