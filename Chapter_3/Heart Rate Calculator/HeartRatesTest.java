import java.util.Scanner;
public class HeartRatesTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Your first name: ");
		String fName = sc.next();
		System.out.print("Please enter Your last name: ");
		String lName = sc.next();
		System.out.print("Please enter Your day of birth: ");
		int dob = sc.nextInt();
		System.out.print("Please enter Your month of birth: ");
		int mob = sc.nextInt();
		System.out.print("Please enter Your year of birth: ");
		int yob = sc.nextInt();
		sc.close();
		
		HeartRates p1 = new HeartRates(fName,lName,dob,mob,yob);
		p1.getData();
		
	}
}